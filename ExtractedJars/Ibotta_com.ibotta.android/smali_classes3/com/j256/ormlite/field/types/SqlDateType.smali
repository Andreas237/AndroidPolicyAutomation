.class public Lcom/j256/ormlite/field/types/SqlDateType;
.super Lcom/j256/ormlite/field/types/DateType;
.source "SqlDateType.java"


# static fields
.field private static final singleTon:Lcom/j256/ormlite/field/types/SqlDateType;

.field private static final sqlDateFormatConfig:Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Lcom/j256/ormlite/field/types/SqlDateType;

    invoke-direct {v0}, Lcom/j256/ormlite/field/types/SqlDateType;-><init>()V

    sput-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->singleTon:Lcom/j256/ormlite/field/types/SqlDateType;

    .line 22
    new-instance v0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->sqlDateFormatConfig:Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 29
    sget-object v0, Lcom/j256/ormlite/field/SqlType;->DATE:Lcom/j256/ormlite/field/SqlType;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/sql/Date;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/DateType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V

    return-void
.end method

.method public static getSingleton()Lcom/j256/ormlite/field/types/SqlDateType;
    .locals 1

    .line 25
    sget-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->singleTon:Lcom/j256/ormlite/field/types/SqlDateType;

    return-object v0
.end method


# virtual methods
.method protected getDefaultDateFormatConfig()Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
    .locals 1

    .line 53
    sget-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->sqlDateFormatConfig:Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;

    return-object v0
.end method

.method public isValidForField(Ljava/lang/reflect/Field;)Z
    .locals 1

    .line 63
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ljava/sql/Date;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public javaToSqlArg(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 47
    check-cast p2, Ljava/sql/Date;

    .line 48
    new-instance p1, Ljava/sql/Timestamp;

    invoke-virtual {p2}, Ljava/sql/Date;->getTime()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Ljava/sql/Timestamp;-><init>(J)V

    return-object p1
.end method

.method public resultStringToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 0

    .line 58
    invoke-static {p2}, Ljava/sql/Timestamp;->valueOf(Ljava/lang/String;)Ljava/sql/Timestamp;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/j256/ormlite/field/types/SqlDateType;->sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p2, Ljava/sql/Timestamp;

    .line 42
    new-instance p1, Ljava/sql/Date;

    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ljava/sql/Date;-><init>(J)V

    return-object p1
.end method
