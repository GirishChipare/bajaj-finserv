package com.app.dtobajaj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseBajajDto {
	private boolean is_success;
	private String user_id;
	private String email;
	private String roll_number;
	private int[] numbers;
	private String[]  alphabets;
}
