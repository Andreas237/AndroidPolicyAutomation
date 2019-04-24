.class public Lcom/j256/ormlite/stmt/SelectArg;
.super Lcom/j256/ormlite/stmt/BaseArgumentHolder;
.source "SelectArg.java"

# interfaces
.implements Lcom/j256/ormlite/stmt/ArgumentHolder;


# instance fields
.field private hasBeenSet:Z

.field private value:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/j256/ormlite/stmt/BaseArgumentHolder;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectArg;->hasBeenSet:Z

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/j256/ormlite/stmt/SelectArg;->value:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 85
    invoke-direct {p0}, Lcom/j256/ormlite/stmt/BaseArgumentHolder;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectArg;->hasBeenSet:Z

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/j256/ormlite/stmt/SelectArg;->value:Ljava/lang/Object;

    .line 86
    invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/SelectArg;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected getValue()Ljava/lang/Object;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectArg;->value:Ljava/lang/Object;

    return-object v0
.end method

.method protected isValueSet()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectArg;->hasBeenSet:Z

    return v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 96
    iput-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectArg;->hasBeenSet:Z

    .line 97
    iput-object p1, p0, Lcom/j256/ormlite/stmt/SelectArg;->value:Ljava/lang/Object;

    return-void
.end method
