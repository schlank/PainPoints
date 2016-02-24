package painpoint.domain.commentary.model;

import com.intellij.ui.JBColor;

public enum ClassStatus {
    UNRATED("unrated", JBColor.BLUE),
    GREAT("Great", JBColor.GREEN),
    GOOD("Good", JBColor.BLUE),
    OK("OK", JBColor.YELLOW),
    BAD("Bad", JBColor.ORANGE),
    PAINPOINT("PAIN POINT", JBColor.RED);

    private String mLabel;
    private JBColor mColor;

    ClassStatus(String label, JBColor color) {
        mLabel = label;
        mColor = color;
    }

    public String getLabel() {
        return mLabel;
    }

    public JBColor getColor() {
        return mColor;
    }
}