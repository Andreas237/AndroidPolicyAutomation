.class public Lorg/researchstack/backbone/task/Task$TaskProgress;
.super Ljava/lang/Object;
.source "Task.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/task/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TaskProgress"
.end annotation


# instance fields
.field private final current:I

.field private final total:I


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .param p1, "current"    # I
    .param p2, "total"    # I

    .prologue
    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    iput p1, p0, Lorg/researchstack/backbone/task/Task$TaskProgress;->current:I

    .line 202
    iput p2, p0, Lorg/researchstack/backbone/task/Task$TaskProgress;->total:I

    .line 203
    return-void
.end method


# virtual methods
.method public getCurrent()I
    .locals 1

    .prologue
    .line 212
    iget v0, p0, Lorg/researchstack/backbone/task/Task$TaskProgress;->current:I

    return v0
.end method

.method public getTotal()I
    .locals 1

    .prologue
    .line 222
    iget v0, p0, Lorg/researchstack/backbone/task/Task$TaskProgress;->total:I

    return v0
.end method