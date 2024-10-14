package dev.omedia.section11.Interfaces;

import java.util.List;

public interface ISaveable {
    List<String> write();

    void read(List<String> savedValues);
}
