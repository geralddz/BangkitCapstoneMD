package com.bangkit2024.facetrack.utils;

import android.annotation.SuppressLint;
import android.graphics.RectF;

import androidx.annotation.NonNull;

public class Recognition {

    private Integer labelId;
    private String labelName;
    private Float labelScore;

    private Float confidence;

    private RectF location;

    public Recognition(final int labelId, final String labelName, final Float labelScore, final Float confidence, final RectF location) {
        this.labelId = labelId;
        this.labelScore = labelScore;
        this.labelName = labelName;
        this.confidence = confidence;
        this.location = location;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public Float getLabelScore() {
        return labelScore;
    }

    public Float getConfidence() {
        return confidence;
    }

    public RectF getLocation() {
        return new RectF(location);
    }

    public void setLocation(RectF location) {
        this.location = location;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public void setLabelScore(Float labelScore) {
        this.labelScore = labelScore;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    @SuppressLint("DefaultLocale")
    @NonNull
    @Override
    public String toString() {
        String resultString = "";

        resultString += labelId + " ";

        if (labelName != null) {
            resultString += labelName + " ";
        }

        if (confidence != null) {
            resultString += String.format("(%.1f%%) ", confidence * 100.0f);
        }

        if (location != null) {
            resultString += location + " ";
        }

        return resultString.trim();
    }

}
