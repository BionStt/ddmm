/*
 * generated by Xtext 2.16.0
 */
package de.fhdo.ddmm.data.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fhdo.ddmm.data.ide.contentassist.antlr.internal.InternalDataDslParser;
import de.fhdo.ddmm.data.services.DataDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DataDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DataDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DataDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDataModelAccess().getAlternatives_1(), "rule__DataModel__Alternatives_1");
			builder.put(grammarAccess.getVersionAccess().getAlternatives_3(), "rule__Version__Alternatives_3");
			builder.put(grammarAccess.getComplexTypeAccess().getAlternatives(), "rule__ComplexType__Alternatives");
			builder.put(grammarAccess.getListTypeAccess().getAlternatives(), "rule__ListType__Alternatives");
			builder.put(grammarAccess.getDataFieldAccess().getAlternatives_1(), "rule__DataField__Alternatives_1");
			builder.put(grammarAccess.getPrimitiveValueAccess().getAlternatives(), "rule__PrimitiveValue__Alternatives");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
			builder.put(grammarAccess.getDataModelAccess().getGroup(), "rule__DataModel__Group__0");
			builder.put(grammarAccess.getComplexTypeImportAccess().getGroup(), "rule__ComplexTypeImport__Group__0");
			builder.put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
			builder.put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
			builder.put(grammarAccess.getDataStructureAccess().getGroup(), "rule__DataStructure__Group__0");
			builder.put(grammarAccess.getDataStructureAccess().getGroup_2(), "rule__DataStructure__Group_2__0");
			builder.put(grammarAccess.getDataStructureAccess().getGroup_4(), "rule__DataStructure__Group_4__0");
			builder.put(grammarAccess.getDataStructureAccess().getGroup_4_1(), "rule__DataStructure__Group_4_1__0");
			builder.put(grammarAccess.getListTypeAccess().getGroup_0(), "rule__ListType__Group_0__0");
			builder.put(grammarAccess.getListTypeAccess().getGroup_0_4(), "rule__ListType__Group_0_4__0");
			builder.put(grammarAccess.getListTypeAccess().getGroup_1(), "rule__ListType__Group_1__0");
			builder.put(grammarAccess.getDataFieldAccess().getGroup(), "rule__DataField__Group__0");
			builder.put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
			builder.put(grammarAccess.getEnumerationAccess().getGroup_4(), "rule__Enumeration__Group_4__0");
			builder.put(grammarAccess.getEnumerationFieldAccess().getGroup(), "rule__EnumerationField__Group__0");
			builder.put(grammarAccess.getEnumerationFieldAccess().getGroup_1(), "rule__EnumerationField__Group_1__0");
			builder.put(grammarAccess.getPossiblyImportedComplexTypeAccess().getGroup(), "rule__PossiblyImportedComplexType__Group__0");
			builder.put(grammarAccess.getPossiblyImportedComplexTypeAccess().getGroup_0(), "rule__PossiblyImportedComplexType__Group_0__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_0(), "rule__PrimitiveType__Group_0__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_1(), "rule__PrimitiveType__Group_1__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_2(), "rule__PrimitiveType__Group_2__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_3(), "rule__PrimitiveType__Group_3__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_4(), "rule__PrimitiveType__Group_4__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_5(), "rule__PrimitiveType__Group_5__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_6(), "rule__PrimitiveType__Group_6__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_7(), "rule__PrimitiveType__Group_7__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_8(), "rule__PrimitiveType__Group_8__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_9(), "rule__PrimitiveType__Group_9__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getDataModelAccess().getComplexTypeImportsAssignment_0(), "rule__DataModel__ComplexTypeImportsAssignment_0");
			builder.put(grammarAccess.getDataModelAccess().getVersionsAssignment_1_0(), "rule__DataModel__VersionsAssignment_1_0");
			builder.put(grammarAccess.getDataModelAccess().getContextsAssignment_1_1(), "rule__DataModel__ContextsAssignment_1_1");
			builder.put(grammarAccess.getDataModelAccess().getComplexTypesAssignment_1_2(), "rule__DataModel__ComplexTypesAssignment_1_2");
			builder.put(grammarAccess.getComplexTypeImportAccess().getImportURIAssignment_3(), "rule__ComplexTypeImport__ImportURIAssignment_3");
			builder.put(grammarAccess.getComplexTypeImportAccess().getNameAssignment_5(), "rule__ComplexTypeImport__NameAssignment_5");
			builder.put(grammarAccess.getVersionAccess().getNameAssignment_1(), "rule__Version__NameAssignment_1");
			builder.put(grammarAccess.getVersionAccess().getComplexTypesAssignment_3_0(), "rule__Version__ComplexTypesAssignment_3_0");
			builder.put(grammarAccess.getVersionAccess().getContextsAssignment_3_1(), "rule__Version__ContextsAssignment_3_1");
			builder.put(grammarAccess.getContextAccess().getNameAssignment_1(), "rule__Context__NameAssignment_1");
			builder.put(grammarAccess.getContextAccess().getComplexTypesAssignment_3(), "rule__Context__ComplexTypesAssignment_3");
			builder.put(grammarAccess.getDataStructureAccess().getNameAssignment_1(), "rule__DataStructure__NameAssignment_1");
			builder.put(grammarAccess.getDataStructureAccess().getSuperAssignment_2_1(), "rule__DataStructure__SuperAssignment_2_1");
			builder.put(grammarAccess.getDataStructureAccess().getDataFieldsAssignment_4_0(), "rule__DataStructure__DataFieldsAssignment_4_0");
			builder.put(grammarAccess.getDataStructureAccess().getDataFieldsAssignment_4_1_1(), "rule__DataStructure__DataFieldsAssignment_4_1_1");
			builder.put(grammarAccess.getListTypeAccess().getNameAssignment_0_1(), "rule__ListType__NameAssignment_0_1");
			builder.put(grammarAccess.getListTypeAccess().getDataFieldsAssignment_0_3(), "rule__ListType__DataFieldsAssignment_0_3");
			builder.put(grammarAccess.getListTypeAccess().getDataFieldsAssignment_0_4_1(), "rule__ListType__DataFieldsAssignment_0_4_1");
			builder.put(grammarAccess.getListTypeAccess().getNameAssignment_1_1(), "rule__ListType__NameAssignment_1_1");
			builder.put(grammarAccess.getListTypeAccess().getPrimitiveTypeAssignment_1_3(), "rule__ListType__PrimitiveTypeAssignment_1_3");
			builder.put(grammarAccess.getDataFieldAccess().getHiddenAssignment_0(), "rule__DataField__HiddenAssignment_0");
			builder.put(grammarAccess.getDataFieldAccess().getPrimitiveTypeAssignment_1_0(), "rule__DataField__PrimitiveTypeAssignment_1_0");
			builder.put(grammarAccess.getDataFieldAccess().getComplexTypeAssignment_1_1(), "rule__DataField__ComplexTypeAssignment_1_1");
			builder.put(grammarAccess.getDataFieldAccess().getNameAssignment_2(), "rule__DataField__NameAssignment_2");
			builder.put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
			builder.put(grammarAccess.getEnumerationAccess().getFieldsAssignment_3(), "rule__Enumeration__FieldsAssignment_3");
			builder.put(grammarAccess.getEnumerationAccess().getFieldsAssignment_4_1(), "rule__Enumeration__FieldsAssignment_4_1");
			builder.put(grammarAccess.getEnumerationFieldAccess().getNameAssignment_0(), "rule__EnumerationField__NameAssignment_0");
			builder.put(grammarAccess.getEnumerationFieldAccess().getInitializationValueAssignment_1_1(), "rule__EnumerationField__InitializationValueAssignment_1_1");
			builder.put(grammarAccess.getPrimitiveValueAccess().getNumericValueAssignment_0(), "rule__PrimitiveValue__NumericValueAssignment_0");
			builder.put(grammarAccess.getPrimitiveValueAccess().getBooleanValueAssignment_1(), "rule__PrimitiveValue__BooleanValueAssignment_1");
			builder.put(grammarAccess.getPrimitiveValueAccess().getStringValueAssignment_2(), "rule__PrimitiveValue__StringValueAssignment_2");
			builder.put(grammarAccess.getPossiblyImportedComplexTypeAccess().getImportAssignment_0_0(), "rule__PossiblyImportedComplexType__ImportAssignment_0_0");
			builder.put(grammarAccess.getPossiblyImportedComplexTypeAccess().getComplexTypeAssignment_1(), "rule__PossiblyImportedComplexType__ComplexTypeAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DataDslGrammarAccess grammarAccess;

	@Override
	protected InternalDataDslParser createParser() {
		InternalDataDslParser result = new InternalDataDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DataDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DataDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
