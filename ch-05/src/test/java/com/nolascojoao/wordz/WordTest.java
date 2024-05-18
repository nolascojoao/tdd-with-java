package com.nolascojoao.wordz;

import com.nolascojoao.wordz.domain.Letter;
import com.nolascojoao.wordz.domain.Word;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WordTest {

    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");

        var score = word.guess("Z");

        assertThat( score.letter(0) ).isEqualTo(Letter.INCORRECT);
    }
}
