.class public Lcom/j256/ormlite/field/types/LongStringType;
.super Lcom/j256/ormlite/field/types/StringType;
.source "LongStringType.java"


# static fields
.field private static final singleTon:Lcom/j256/ormlite/field/types/LongStringType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/j256/ormlite/field/types/LongStringType;

    invoke-direct {v0}, Lcom/j256/ormlite/field/types/LongStringType;-><init>()V

    sput-object v0, Lcom/j256/ormlite/field/types/LongStringType;->singleTon:Lcom/j256/ormlite/field/types/LongStringType;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 19
    sget-object v0, Lcom/j256/ormlite/field/SqlType;->LONG_STRING:Lcom/j256/ormlite/field/SqlType;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/StringType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V

    return-void
.end method

.method public static getSingleton()Lcom/j256/ormlite/field/types/LongStringType;
    .locals 1

    .line 15
    sget-object v0, Lcom/j256/ormlite/field/types/LongStringType;->singleTon:Lcom/j256/ormlite/field/types/LongStringType;

    return-object v0
.end method


# virtual methods
.method public getDefaultWidth()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getPrimaryClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 41
    const-class v0, Ljava/lang/String;

    return-object v0
.end method

.method public isAppropriateId()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
