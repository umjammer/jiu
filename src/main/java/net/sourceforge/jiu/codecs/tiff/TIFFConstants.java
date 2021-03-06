/*
 * TIFFConstants
 * 
 * Copyright (c) 2001, 2002, 2003 Marco Schmidt.
 * All rights reserved.
 */

package net.sourceforge.jiu.codecs.tiff;

/**
 * This class provides a lot of constant values for a TIFF encoder or decoder.
 * @author Marco Schmidt
 */
public interface TIFFConstants
{
	int COMPRESSION_NONE = 1;
	int COMPRESSION_CCITT_GROUP3_1D_MODIFIED_HUFFMAN = 2;
	int COMPRESSION_CCITT_T4 = 3;
	int COMPRESSION_CCITT_T6 = 4;
	int COMPRESSION_LZW = 5;
	int COMPRESSION_JPEG_6_0 = 6;
	int COMPRESSION_JPEG_POST_6_0 = 7;
	int COMPRESSION_DEFLATED_OFFICIAL = 8;
	int COMPRESSION_NEXT = 32766;
	int COMPRESSION_NONE_WORD_ALIGNED = 32771;
	int COMPRESSION_PACKBITS = 32773;
	int COMPRESSION_THUNDERSCAN = 32809;
	int COMPRESSION_DEFLATED_INOFFICIAL = 32946;
	int COMPRESSION_JBIG = 34661;
	int COMPRESSION_SGI_LOG_RLE = 34676;
	int COMPRESSION_SGI_LOG_24_PACKED = 34677;
	int COMPRESSION_JBIG2 = 34715;

	int PHOTOMETRIC_WHITE_IS_ZERO = 0;
	int PHOTOMETRIC_BLACK_IS_ZERO = 1;
	int PHOTOMETRIC_PALETTED = 3;
	int PHOTOMETRIC_TRUECOLOR_RGB = 2;
	int PHOTOMETRIC_TRUECOLOR_CMYK = 5;
	int PHOTOMETRIC_LOGL = 32844;
	int PHOTOMETRIC_TRUECOLOR_LOGLUV = 32845;

	int PLANAR_CONFIGURATION_CHUNKY = 1;
	int PLANAR_CONFIGURATION_PLANAR = 2;

	/**
	 * Length of a tag (an image file directory entry) in bytes (12).
	 */
	int TAG_LENGTH = 12;

	// tag types

	int TAG_TYPE_BYTE = 1;
	int TAG_TYPE_ASCII = 2;
	int TAG_TYPE_SHORT = 3;
	int TAG_TYPE_LONG = 4;
	int TAG_TYPE_RATIONAL = 5;
	int TAG_TYPE_SBYTE = 6;
	int TAG_TYPE_UNDEFINED = 7;
	int TAG_TYPE_SSHORT = 8;
	int TAG_TYPE_SLONG = 9;
	int TAG_TYPE_SRATIONAL = 10;
	int TAG_TYPE_FLOAT = 11;
	int TAG_TYPE_DOUBLE = 12;

	// tag IDs

	int TAG_ARTIST = 315;
	int TAG_BAD_FAX_LINES = 326;
	int TAG_BITS_PER_SAMPLE = 258;
	int TAG_CELL_LENGTH = 265;
	int TAG_CELL_WIDTH = 264;
	int TAG_CLEAN_FAX_DATA = 327;
	int TAG_COLOR_MAP = 320;
	int TAG_COMPRESSION = 259;
	int TAG_CONSECUTIVE_BAD_FAX_LINES = 328;
	int TAG_COPYRIGHT = 33432;
	int TAG_DATE_TIME = 306;
	int TAG_DOCUMENT_NAME = 269;
	int TAG_EXTRA_SAMPLES = 338;
	int TAG_FILL_ORDER = 266;
	int TAG_FREE_BYTE_COUNTS = 289;
	int TAG_FREE_OFFSETS = 288;
	int TAG_GRAY_RESPONSE_CURVE = 291;
	int TAG_GRAY_RESPONSE_UNIT = 290;
	int TAG_HOST_COMPUTER = 316;
	int TAG_IMAGE_DESCRIPTION = 270;
	int TAG_IMAGE_LENGTH = 257;
	int TAG_IMAGE_WIDTH = 256;
	int TAG_MAKE = 271;
	int TAG_MAX_SAMPLE_VALUE = 281;
	int TAG_MIN_SAMPLE_VALUE = 280;
	int TAG_MODEL = 272;
	int TAG_NEW_SUBFILE_TYPE = 254;
	int TAG_ORIENTATION = 274;
	int TAG_PHOTOMETRIC_INTERPRETATION = 262;
	int TAG_PHOTOSHOP_IMAGE_RESOURCES = 34377;
	int TAG_PLANAR_CONFIGURATION = 284;
	int TAG_PREDICTOR = 317;
	int TAG_RESOLUTION_UNIT = 296;
	int TAG_RESOLUTION_X = 282;
	int TAG_RESOLUTION_Y = 283;
	int TAG_ROWS_PER_STRIP = 278;
	int TAG_SAMPLES_PER_PIXEL = 277;
	int TAG_SOFTWARE = 305;
	int TAG_STRIP_BYTE_COUNTS = 279;
	int TAG_STRIP_OFFSETS = 273;
	int TAG_T4_OPTIONS = 292;
	int TAG_T6_OPTIONS = 293;
	int TAG_TILE_BYTE_COUNTS = 325;
	int TAG_TILE_HEIGHT = 323;
	int TAG_TILE_OFFSETS = 324;
	int TAG_TILE_WIDTH = 322;
}
