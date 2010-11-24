/**
 * This file Copyright (c) 2005-2010 Aptana, Inc. This program is
 * dual-licensed under both the Aptana Public License and the GNU General
 * Public license. You may elect to use one or the other of these licenses.
 * 
 * This program is distributed in the hope that it will be useful, but
 * AS-IS and WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE, TITLE, or
 * NONINFRINGEMENT. Redistribution, except as permitted by whichever of
 * the GPL or APL you select, is prohibited.
 *
 * 1. For the GPL license (GPL), you can redistribute and/or modify this
 * program under the terms of the GNU General Public License,
 * Version 3, as published by the Free Software Foundation.  You should
 * have received a copy of the GNU General Public License, Version 3 along
 * with this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Aptana provides a special exception to allow redistribution of this file
 * with certain other free and open source software ("FOSS") code and certain additional terms
 * pursuant to Section 7 of the GPL. You may view the exception and these
 * terms on the web at http://www.aptana.com/legal/gpl/.
 * 
 * 2. For the Aptana Public License (APL), this program and the
 * accompanying materials are made available under the terms of the APL
 * v1.0 which accompanies this distribution, and is available at
 * http://www.aptana.com/legal/apl/.
 * 
 * You may view the GPL, Aptana's exception and additional terms, and the
 * APL in the file titled license.html at the root of the corresponding
 * plugin containing this source file.
 * 
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.php.formatter;

import com.aptana.formatter.ui.CodeFormatterConstants;

/**
 * PHP code formatter constants.<br>
 * Since the formatters will be saved in a unified XML file, it's important to have a unique key for every setting. The
 * PHP formatter constants are all starting with the {@link #FORMATTER_ID} string.
 */
public interface PHPFormatterConstants
{

	/**
	 * PHP formatter ID.
	 */
	public static final String FORMATTER_ID = "php.formatter"; //$NON-NLS-1$

	public static final String FORMATTER_TAB_CHAR = FORMATTER_ID + '.' + CodeFormatterConstants.FORMATTER_TAB_CHAR;
	public static final String FORMATTER_TAB_SIZE = FORMATTER_ID + '.' + CodeFormatterConstants.FORMATTER_TAB_SIZE;

	// Wrapping
	public static final String WRAP_COMMENTS = FORMATTER_ID + ".wrap.comments"; //$NON-NLS-1$
	public static final String WRAP_COMMENTS_LENGTH = FORMATTER_ID + ".wrap.comments.length"; //$NON-NLS-1$

	// Indentation
	public static final String INDENT_BLOCKS = FORMATTER_ID + ".indent.blocks"; //$NON-NLS-1$
	public static final String INDENT_NAMESPACE_BLOCKS = FORMATTER_ID + ".indent.namespace.blocks"; //$NON-NLS-1$
	public static final String INDENT_FUNCTION_BODY = FORMATTER_ID + ".indent.function.body"; //$NON-NLS-1$
	public static final String INDENT_TYPE_BODY = FORMATTER_ID + ".indent.class.body"; //$NON-NLS-1$
	public static final String INDENT_SWITCH_BODY = FORMATTER_ID + ".indent.switch.body"; //$NON-NLS-1$
	public static final String INDENT_CASE_BODY = FORMATTER_ID + ".indent.case.body"; //$NON-NLS-1$
	public static final String INDENT_BREAK_IN_CASE = FORMATTER_ID + ".indent.breakInCase"; //$NON-NLS-1$
	public static final String FORMATTER_INDENTATION_SIZE = FORMATTER_ID + '.'
			+ CodeFormatterConstants.FORMATTER_INDENTATION_SIZE;

	// New lines
	public static final String NEW_LINES_BEFORE_ELSE_STATEMENT = FORMATTER_ID + ".newline.before.else"; //$NON-NLS-1$
	public static final String NEW_LINES_BEFORE_IF_IN_ELSEIF_STATEMENT = FORMATTER_ID + ".newline.before.if.in.elseif"; //$NON-NLS-1$
	public static final String NEW_LINES_BEFORE_CATCH_STATEMENT = FORMATTER_ID + ".newline.before.catch"; //$NON-NLS-1$
	public static final String NEW_LINES_BEFORE_DO_WHILE_STATEMENT = FORMATTER_ID + ".newline.before.dowhile"; //$NON-NLS-1$

	// Empty lines
	public static final String LINES_AFTER_FUNCTION_DECLARATION = FORMATTER_ID + ".line.after.function.declaration"; //$NON-NLS-1$
	public static final String LINES_AFTER_TYPE_DECLARATION = FORMATTER_ID + ".line.after.class.declaration"; //$NON-NLS-1$
	public static final String PRESERVED_LINES = FORMATTER_ID + ".line.preserve"; //$NON-NLS-1$

	// Braces position
	public static final String BRACE_POSITION_FUNCTION_DECLARATION = FORMATTER_ID
			+ ".brace.position.function.declaration"; //$NON-NLS-1$
	public static final String BRACE_POSITION_TYPE_DECLARATION = FORMATTER_ID + ".brace.position.class.declaration"; //$NON-NLS-1$
	public static final String BRACE_POSITION_BLOCK = FORMATTER_ID + ".brace.position.blocks"; //$NON-NLS-1$
	public static final String BRACE_POSITION_BLOCK_IN_SWITCH = FORMATTER_ID + ".brace.position.switch.block"; //$NON-NLS-1$
	public static final String BRACE_POSITION_BLOCK_IN_CASE = FORMATTER_ID + ".brace.position.case.block"; //$NON-NLS-1$

	// Spaces
	public static final String SPACES_BEFORE_STATIC_INVOCATION_OPERATOR = FORMATTER_ID
			+ ".spaces.before.staticInvocation"; //$NON-NLS-1$
	public static final String SPACES_AFTER_STATIC_INVOCATION_OPERATOR = FORMATTER_ID
			+ ".spaces.after.staticInvocation"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_ASSIGNMENT_OPERATOR = FORMATTER_ID + ".spaces.before.assignment"; //$NON-NLS-1$
	public static final String SPACES_AFTER_ASSIGNMENT_OPERATOR = FORMATTER_ID + ".spaces.after.assignment"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_COMMAS = FORMATTER_ID + ".spaces.before.commas"; //$NON-NLS-1$
	public static final String SPACES_AFTER_COMMAS = FORMATTER_ID + ".spaces.after.commas"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_CASE_COLON_OPERATOR = FORMATTER_ID + ".spaces.after.case.colon"; //$NON-NLS-1$
	public static final String SPACES_AFTER_CASE_COLON_OPERATOR = FORMATTER_ID + ".spaces.before.case.colon"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_COLON = FORMATTER_ID + ".spaces.before.colon"; //$NON-NLS-1$
	public static final String SPACES_AFTER_COLON = FORMATTER_ID + ".spaces.after.colon"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_SEMICOLON = FORMATTER_ID + ".spaces.before.semicolon"; //$NON-NLS-1$
	public static final String SPACES_AFTER_SEMICOLON = FORMATTER_ID + ".spaces.after.semicolon"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_CONCATENATION_OPERATOR = FORMATTER_ID + ".spaces.before.dot"; //$NON-NLS-1$
	public static final String SPACES_AFTER_CONCATENATION_OPERATOR = FORMATTER_ID + ".spaces.after.dot"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_ARROW_OPERATOR = FORMATTER_ID + ".spaces.before.arrow"; //$NON-NLS-1$
	public static final String SPACES_AFTER_ARROW_OPERATOR = FORMATTER_ID + ".spaces.after.arrow"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_KEY_VALUE_OPERATOR = FORMATTER_ID + ".spaces.before.keyValue"; //$NON-NLS-1$
	public static final String SPACES_AFTER_KEY_VALUE_OPERATOR = FORMATTER_ID + ".spaces.after.keyValue"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_RELATIONAL_OPERATORS = FORMATTER_ID + ".spaces.before.relational"; //$NON-NLS-1$
	public static final String SPACES_AFTER_RELATIONAL_OPERATORS = FORMATTER_ID + ".spaces.after.relational"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_CONDITIONAL_OPERATOR = FORMATTER_ID + ".spaces.before.conditional"; //$NON-NLS-1$
	public static final String SPACES_AFTER_CONDITIONAL_OPERATOR = FORMATTER_ID + ".spaces.after.conditional"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_POSTFIX_OPERATOR = FORMATTER_ID + ".spaces.before.postfix"; //$NON-NLS-1$
	public static final String SPACES_AFTER_POSTFIX_OPERATOR = FORMATTER_ID + ".spaces.after.postfix"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_PREFIX_OPERATOR = FORMATTER_ID + ".spaces.before.prefix"; //$NON-NLS-1$
	public static final String SPACES_AFTER_PREFIX_OPERATOR = FORMATTER_ID + ".spaces.after.prefix"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_ARITHMETIC_OPERATOR = FORMATTER_ID + ".spaces.before.arithmetic"; //$NON-NLS-1$
	public static final String SPACES_AFTER_ARITHMETIC_OPERATOR = FORMATTER_ID + ".spaces.after.arithmetic"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_UNARY_OPERATOR = FORMATTER_ID + ".spaces.before.unary"; //$NON-NLS-1$
	public static final String SPACES_AFTER_UNARY_OPERATOR = FORMATTER_ID + ".spaces.after.unary"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_NAMESPACE_SEPARATOR = FORMATTER_ID + ".spaces.before.namespaceSeparator"; //$NON-NLS-1$
	public static final String SPACES_AFTER_NAMESPACE_SEPARATOR = FORMATTER_ID + ".spaces.after.namespaceSeparator"; //$NON-NLS-1$
	public static final String SPACES_BEFORE_PARENTHESES = FORMATTER_ID + ".spaces.before.parentheses"; //$NON-NLS-1$
	public static final String SPACES_AFTER_PARENTHESES = FORMATTER_ID + ".spaces.after.parentheses"; //$NON-NLS-1$
}