package com.polovnev.behavioral.iterator.iterators;

import com.polovnev.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
