.class public abstract Lcom/j256/ormlite/field/types/BaseDataType;
.super Lcom/j256/ormlite/field/BaseFieldConverter;
.source "BaseDataType.java"

# interfaces
.implements Lcom/j256/ormlite/field/DataPersister;


# instance fields
.field private final classes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final sqlType:Lcom/j256/ormlite/field/SqlType;


# direct methods
.method public constructor <init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/field/SqlType;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Lcom/j256/ormlite/field/BaseFieldConverter;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/j256/ormlite/field/types/BaseDataType;->sqlType:Lcom/j256/ormlite/field/SqlType;

    .line 46
    iput-object p2, p0, Lcom/j256/ormlite/field/types/BaseDataType;->classes:[Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public convertIdNumber(Ljava/lang/Number;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public dataIsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    if-nez p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    if-nez p2, :cond_2

    return v0

    .line 148
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public generateId()Ljava/lang/Object;
    .locals 2

    .line 135
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should not have tried to generate this type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getAssociatedClassNames()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAssociatedClasses()[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/j256/ormlite/field/types/BaseDataType;->classes:[Ljava/lang/Class;

    return-object v0
.end method

.method public getDefaultWidth()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getPrimaryClass()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/j256/ormlite/field/types/BaseDataType;->classes:[Ljava/lang/Class;

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 72
    aget-object v0, v0, v1

    return-object v0
.end method

.method public getSqlType()Lcom/j256/ormlite/field/SqlType;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/j256/ormlite/field/types/BaseDataType;->sqlType:Lcom/j256/ormlite/field/SqlType;

    return-object v0
.end method

.method public isAppropriateId()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isArgumentHolderRequired()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isComparable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isEscapedDefaultValue()Z
    .locals 1

    .line 107
    invoke-virtual {p0}, Lcom/j256/ormlite/field/types/BaseDataType;->isEscapedValue()Z

    move-result v0

    return v0
.end method

.method public isEscapedValue()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isPrimitive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isSelfGeneratedId()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isValidForField(Ljava/lang/reflect/Field;)Z
    .locals 7

    .line 55
    iget-object v0, p0, Lcom/j256/ormlite/field/types/BaseDataType;->classes:[Ljava/lang/Class;

    array-length v1, v0

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    .line 59
    :cond_0
    array-length v1, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    aget-object v5, v0, v4

    .line 60
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return v3
.end method

.method public isValidForVersion()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isValidGeneratedType()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public makeConfigObject(Lcom/j256/ormlite/field/FieldType;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract parseDefaultString(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation
.end method

.method public resultStringToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 161
    invoke-virtual {p0, p1, p2}, Lcom/j256/ormlite/field/types/BaseDataType;->parseDefaultString(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
