// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.thrift.lang.lexer.ThriftTokenTypes.*;
import com.intellij.plugins.thrift.lang.psi.*;
import com.intellij.plugins.thrift.util.ThriftPsiUtil;

public class ThriftEnumFieldImpl extends ThriftPsiCompositeElementImpl implements ThriftEnumField {

  public ThriftEnumFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitEnumField(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ThriftIntConstant getIntConstant() {
    return findChildByClass(ThriftIntConstant.class);
  }

  @Override
  @Nullable
  public ThriftListSeparator getListSeparator() {
    return findChildByClass(ThriftListSeparator.class);
  }

  @Override
  @Nullable
  public ThriftTypeAnnotations getTypeAnnotations() {
    return findChildByClass(ThriftTypeAnnotations.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
