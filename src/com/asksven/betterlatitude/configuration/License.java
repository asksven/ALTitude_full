package com.asksven.betterlatitude.configuration;
/*
 * Copyright (C) 2011 asksven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * This class determines the license (free or full) based on its presence
 * and on a version number it delivers
 * @author sven
 *
 */
public class License
{
	private static final int VERSION = 1;
	
	public static final int getVersion()
	{
		return VERSION;
	}
}
