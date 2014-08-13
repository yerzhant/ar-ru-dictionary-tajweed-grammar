/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arabicdictionary;

import java.util.Objects;

/**
 *
 * @author yerzhan
 */
public class Article {

    Integer id;
    String arabic;
    String kind;
    String addInfo1;
    String addInfo2;
    String addInfo3;
    String addInfo4;
    String addInfo5;
    String addInfo6;
    String addInfo7;
    String russian;
    String base;
    String base3;
    String base5;
    String base7;

    public Article(Integer id, String arabic, String kind, String addInfo1, String addInfo2, String addInfo3, String addInfo4, String addInfo5, String addInfo6, String addInfo7, String russian) {
        this.id = id;
        this.arabic = arabic;
        this.kind = kind;
        this.addInfo1 = addInfo1;
        this.addInfo2 = addInfo2;
        this.addInfo3 = addInfo3;
        this.addInfo4 = addInfo4;
        this.addInfo5 = addInfo5;
        this.addInfo6 = addInfo6;
        this.addInfo7 = addInfo7;
        this.russian = russian;

        base = arabic.replaceAll(""
                + (char) 1611 + "|"
                + (char) 1612 + "|"
                + (char) 1613 + "|"
                + (char) 1614 + "|"
                + (char) 1615 + "|"
                + (char) 1616 + "|"
                + (char) 1617 + "|"
                + (char) 1618 + "|"
                + (char) 1619 + "|"
                + (char) 1620 + "|"
                + (char) 1621 + "|", "").trim();

        base3 = addInfo3.replaceAll(""
                + (char) 1611 + "|"
                + (char) 1612 + "|"
                + (char) 1613 + "|"
                + (char) 1614 + "|"
                + (char) 1615 + "|"
                + (char) 1616 + "|"
                + (char) 1617 + "|"
                + (char) 1618 + "|"
                + (char) 1619 + "|"
                + (char) 1620 + "|"
                + (char) 1621 + "|", "").trim();

        base5 = addInfo5.replaceAll(""
                + (char) 1611 + "|"
                + (char) 1612 + "|"
                + (char) 1613 + "|"
                + (char) 1614 + "|"
                + (char) 1615 + "|"
                + (char) 1616 + "|"
                + (char) 1617 + "|"
                + (char) 1618 + "|"
                + (char) 1619 + "|"
                + (char) 1620 + "|"
                + (char) 1621 + "|", "").trim();

        base7 = addInfo7.replaceAll(""
                + (char) 1611 + "|"
                + (char) 1612 + "|"
                + (char) 1613 + "|"
                + (char) 1614 + "|"
                + (char) 1615 + "|"
                + (char) 1616 + "|"
                + (char) 1617 + "|"
                + (char) 1618 + "|"
                + (char) 1619 + "|"
                + (char) 1620 + "|"
                + (char) 1621 + "|", "").trim();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.arabic);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return arabic + " (" + kind + ") - " + russian;
    }
}
