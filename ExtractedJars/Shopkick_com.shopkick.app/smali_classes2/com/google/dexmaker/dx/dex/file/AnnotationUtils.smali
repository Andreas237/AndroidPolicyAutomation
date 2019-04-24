.class public final Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;
.super Ljava/lang/Object;
.source "AnnotationUtils.java"


# static fields
.field private static final ACCESS_FLAGS_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

.field private static final ANNOTATION_DEFAULT_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final ENCLOSING_CLASS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final ENCLOSING_METHOD_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final INNER_CLASS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final MEMBER_CLASSES_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final NAME_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

.field private static final SIGNATURE_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final THROWS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private static final VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "Ldalvik/annotation/AnnotationDefault;"

    .line 41
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ANNOTATION_DEFAULT_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    const-string v0, "Ldalvik/annotation/EnclosingClass;"

    .line 45
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ENCLOSING_CLASS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    const-string v0, "Ldalvik/annotation/EnclosingMethod;"

    .line 49
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ENCLOSING_METHOD_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    const-string v0, "Ldalvik/annotation/InnerClass;"

    .line 53
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->INNER_CLASS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    const-string v0, "Ldalvik/annotation/MemberClasses;"

    .line 57
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->MEMBER_CLASSES_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    const-string v0, "Ldalvik/annotation/Signature;"

    .line 61
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->SIGNATURE_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    const-string v0, "Ldalvik/annotation/Throws;"

    .line 65
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->THROWS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 69
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string v1, "accessFlags"

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ACCESS_FLAGS_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    .line 72
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string v1, "name"

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->NAME_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    .line 75
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string/jumbo v1, "value"

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static makeAnnotationDefault(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)Lcom/google/dexmaker/dx/rop/annotation/Annotation;
    .locals 4

    .line 91
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ANNOTATION_DEFAULT_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v2, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V

    .line 93
    new-instance v1, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v2, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    new-instance v3, Lcom/google/dexmaker/dx/rop/cst/CstAnnotation;

    invoke-direct {v3, p0}, Lcom/google/dexmaker/dx/rop/cst/CstAnnotation;-><init>(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)V

    invoke-direct {v1, v2, v3}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 94
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->setImmutable()V

    return-object v0
.end method

.method private static makeCstArray(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/cst/CstArray;
    .locals 4

    .line 242
    invoke-interface {p0}, Lcom/google/dexmaker/dx/rop/type/TypeList;->size()I

    move-result v0

    .line 243
    new-instance v1, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 246
    invoke-interface {p0, v2}, Lcom/google/dexmaker/dx/rop/type/TypeList;->getType(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v3

    invoke-static {v3}, Lcom/google/dexmaker/dx/rop/cst/CstType;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->set(ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 249
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->setImmutable()V

    .line 250
    new-instance p0, Lcom/google/dexmaker/dx/rop/cst/CstArray;

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstArray;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstArray$List;)V

    return-object p0
.end method

.method public static makeEnclosingClass(Lcom/google/dexmaker/dx/rop/cst/CstType;)Lcom/google/dexmaker/dx/rop/annotation/Annotation;
    .locals 3

    .line 105
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ENCLOSING_CLASS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v2, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V

    .line 107
    new-instance v1, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v2, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {v1, v2, p0}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 108
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->setImmutable()V

    return-object v0
.end method

.method public static makeEnclosingMethod(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;)Lcom/google/dexmaker/dx/rop/annotation/Annotation;
    .locals 3

    .line 119
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ENCLOSING_METHOD_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v2, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V

    .line 121
    new-instance v1, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v2, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {v1, v2, p0}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 122
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->setImmutable()V

    return-object v0
.end method

.method public static makeInnerClass(Lcom/google/dexmaker/dx/rop/cst/CstString;I)Lcom/google/dexmaker/dx/rop/annotation/Annotation;
    .locals 3

    .line 135
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->INNER_CLASS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v2, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V

    if-eqz p0, :cond_0

    goto :goto_0

    .line 136
    :cond_0
    sget-object p0, Lcom/google/dexmaker/dx/rop/cst/CstKnownNull;->THE_ONE:Lcom/google/dexmaker/dx/rop/cst/CstKnownNull;

    .line 138
    :goto_0
    new-instance v1, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v2, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->NAME_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {v1, v2, p0}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 139
    new-instance p0, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->ACCESS_FLAGS_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->make(I)Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 141
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->setImmutable()V

    return-object v0
.end method

.method public static makeMemberClasses(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/annotation/Annotation;
    .locals 3

    .line 152
    invoke-static {p0}, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->makeCstArray(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/cst/CstArray;

    move-result-object p0

    .line 153
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->MEMBER_CLASSES_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v2, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V

    .line 154
    new-instance v1, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v2, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {v1, v2, p0}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 155
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->setImmutable()V

    return-object v0
.end method

.method public static makeSignature(Lcom/google/dexmaker/dx/rop/cst/CstString;)Lcom/google/dexmaker/dx/rop/annotation/Annotation;
    .locals 8

    .line 166
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->SIGNATURE_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v2, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V

    .line 173
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    move-result-object p0

    .line 174
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 175
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_5

    .line 178
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    add-int/lit8 v6, v4, 0x1

    const/16 v7, 0x4c

    if-ne v5, v7, :cond_2

    :goto_1
    if-ge v6, v1, :cond_4

    .line 183
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x3b

    if-ne v5, v7, :cond_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_0
    const/16 v7, 0x3c

    if-ne v5, v7, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-ge v6, v1, :cond_4

    .line 195
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v7, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 203
    :cond_4
    :goto_3
    invoke-virtual {p0, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto :goto_0

    .line 207
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p0

    .line 208
    new-instance v1, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;

    invoke-direct {v1, p0}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;-><init>(I)V

    :goto_4
    if-ge v3, p0, :cond_6

    .line 211
    new-instance v4, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v4, v5}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->set(ILcom/google/dexmaker/dx/rop/cst/Constant;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 214
    :cond_6
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->setImmutable()V

    .line 216
    new-instance p0, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v2, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    new-instance v3, Lcom/google/dexmaker/dx/rop/cst/CstArray;

    invoke-direct {v3, v1}, Lcom/google/dexmaker/dx/rop/cst/CstArray;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstArray$List;)V

    invoke-direct {p0, v2, v3}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 217
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->setImmutable()V

    return-object v0
.end method

.method public static makeThrows(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/annotation/Annotation;
    .locals 3

    .line 228
    invoke-static {p0}, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->makeCstArray(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/cst/CstArray;

    move-result-object p0

    .line 229
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->THROWS_TYPE:Lcom/google/dexmaker/dx/rop/cst/CstType;

    sget-object v2, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V

    .line 230
    new-instance v1, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    sget-object v2, Lcom/google/dexmaker/dx/dex/file/AnnotationUtils;->VALUE_STRING:Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {v1, v2, p0}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V

    .line 231
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->setImmutable()V

    return-object v0
.end method
