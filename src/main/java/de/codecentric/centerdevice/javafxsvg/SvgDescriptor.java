package de.codecentric.centerdevice.javafxsvg;

import com.sun.javafx.iio.common.ImageDescriptor;

public class SvgDescriptor extends ImageDescriptor {

	private static final String formatName = "SVG";

	private static final String[] extensions = { "svg" };

	private static final Signature[] signatures = {
			new Signature("<svg".getBytes()),
			new Signature("<?xml".getBytes()) };

	private static final String[] mimeType = { "image/svg+xml" };

	private static ImageDescriptor theInstance = null;

	private SvgDescriptor() {
		super(formatName, extensions, signatures, mimeType);
	}

	public static synchronized ImageDescriptor getInstance() {
		if (theInstance == null) {
			theInstance = new SvgDescriptor();
		}
		return theInstance;
	}
}
