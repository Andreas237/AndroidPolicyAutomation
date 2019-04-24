.class public Lcom/j256/ormlite/field/types/BooleanType;
.super Lcom/j256/ormlite/field/types/BooleanObjectType;
.source "BooleanType.java"


# static fields
.field private static final singleTon:Lcom/j256/ormlite/field/types/BooleanType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/j256/ormlite/field/types/BooleanType;

    invoke-direct {v0}, Lcom/j256/ormlite/field/types/BooleanType;-><init>()V

    sput-object v0, Lcom/j256/ormlite/field/types/BooleanType;->singleTon:Lcom/j256/ormlite/field/types/BooleanType;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 19
    sget-object v0, Lcom/j256/ormlite/field/SqlType;->BOOLEAN:Lcom/j256/ormlite/field/SqlType;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/BooleanObjectType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V

    return-void
.end method

.method public static getSingleton()Lcom/j256/ormlite/field/types/BooleanType;
    .locals 1

    .line 15
    sget-object v0, Lcom/j256/ormlite/field/types/BooleanType;->singleTon:Lcom/j256/ormlite/field/types/BooleanType;

    return-object v0
.end method


# virtual methods
.method public isPrimitive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
