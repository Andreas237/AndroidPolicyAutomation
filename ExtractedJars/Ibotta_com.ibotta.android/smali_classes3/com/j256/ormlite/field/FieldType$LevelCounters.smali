.class Lcom/j256/ormlite/field/FieldType$LevelCounters;
.super Ljava/lang/Object;
.source "FieldType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/j256/ormlite/field/FieldType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LevelCounters"
.end annotation


# instance fields
.field autoRefreshLevel:I

.field autoRefreshLevelMax:I

.field foreignCollectionLevel:I

.field foreignCollectionLevelMax:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1071
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/j256/ormlite/field/FieldType$1;)V
    .locals 0

    .line 1071
    invoke-direct {p0}, Lcom/j256/ormlite/field/FieldType$LevelCounters;-><init>()V

    return-void
.end method
