.class public Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;
.super Lcom/google/protobuf/ExtensionLite;
.source "GeneratedMessageLite.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessageLite;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GeneratedExtension"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/protobuf/MessageLite;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/ExtensionLite<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field final containingTypeDefaultInstance:Lcom/google/protobuf/MessageLite;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TContainingType;"
        }
    .end annotation
.end field

.field final defaultValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TType;"
        }
    .end annotation
.end field

.field final descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

.field final messageDefaultInstance:Lcom/google/protobuf/MessageLite;


# direct methods
.method constructor <init>(Lcom/google/protobuf/MessageLite;Ljava/lang/Object;Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TContainingType;TType;",
            "Lcom/google/protobuf/MessageLite;",
            "Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    .line 1039
    invoke-direct {p0}, Lcom/google/protobuf/ExtensionLite;-><init>()V

    if-nez p1, :cond_0

    .line 1043
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null containingTypeDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1046
    :cond_0
    invoke-virtual {p4}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getLiteType()Lcom/google/protobuf/WireFormat$FieldType;

    move-result-object p5

    sget-object v0, Lcom/google/protobuf/WireFormat$FieldType;->MESSAGE:Lcom/google/protobuf/WireFormat$FieldType;

    if-ne p5, v0, :cond_1

    if-nez p3, :cond_1

    .line 1048
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null messageDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1051
    :cond_1
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->containingTypeDefaultInstance:Lcom/google/protobuf/MessageLite;

    .line 1052
    iput-object p2, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->defaultValue:Ljava/lang/Object;

    .line 1053
    iput-object p3, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->messageDefaultInstance:Lcom/google/protobuf/MessageLite;

    .line 1054
    iput-object p4, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    return-void
.end method


# virtual methods
.method fromFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1087
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1088
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getLiteJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/WireFormat$JavaType;->ENUM:Lcom/google/protobuf/WireFormat$JavaType;

    if-ne v0, v1, :cond_1

    .line 1089
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1090
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1091
    invoke-virtual {p0, v1}, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->singularFromFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    return-object p1

    .line 1098
    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->singularFromFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getContainingTypeDefaultInstance()Lcom/google/protobuf/MessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TContainingType;"
        }
    .end annotation

    .line 1066
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->containingTypeDefaultInstance:Lcom/google/protobuf/MessageLite;

    return-object v0
.end method

.method public getDefaultValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TType;"
        }
    .end annotation

    .line 1147
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->defaultValue:Ljava/lang/Object;

    return-object v0
.end method

.method public getLiteType()Lcom/google/protobuf/WireFormat$FieldType;
    .locals 1

    .line 1137
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getLiteType()Lcom/google/protobuf/WireFormat$FieldType;

    move-result-object v0

    return-object v0
.end method

.method public getMessageDefaultInstance()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 1082
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->messageDefaultInstance:Lcom/google/protobuf/MessageLite;

    return-object v0
.end method

.method public getNumber()I
    .locals 1

    .line 1072
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getNumber()I

    move-result v0

    return v0
.end method

.method public isRepeated()Z
    .locals 1

    .line 1142
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    iget-boolean v0, v0, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->isRepeated:Z

    return v0
.end method

.method singularFromFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1103
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getLiteJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/WireFormat$JavaType;->ENUM:Lcom/google/protobuf/WireFormat$JavaType;

    if-ne v0, v1, :cond_0

    .line 1104
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    iget-object v0, v0, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->enumTypeMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$EnumLiteMap;->findValueByNumber(I)Lcom/google/protobuf/Internal$EnumLite;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p1
.end method

.method singularToFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1128
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getLiteJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/WireFormat$JavaType;->ENUM:Lcom/google/protobuf/WireFormat$JavaType;

    if-ne v0, v1, :cond_0

    .line 1129
    check-cast p1, Lcom/google/protobuf/Internal$EnumLite;

    invoke-interface {p1}, Lcom/google/protobuf/Internal$EnumLite;->getNumber()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p1
.end method

.method toFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1112
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1113
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->descriptor:Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getLiteJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/WireFormat$JavaType;->ENUM:Lcom/google/protobuf/WireFormat$JavaType;

    if-ne v0, v1, :cond_1

    .line 1114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1115
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1116
    invoke-virtual {p0, v1}, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->singularToFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    return-object p1

    .line 1123
    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessageLite$GeneratedExtension;->singularToFieldSetType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
