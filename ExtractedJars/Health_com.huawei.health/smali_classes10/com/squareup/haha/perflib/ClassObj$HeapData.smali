.class public Lcom/squareup/haha/perflib/ClassObj$HeapData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/perflib/ClassObj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HeapData"
.end annotation


# instance fields
.field public mInstances:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field

.field public mShallowSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/haha/perflib/ClassObj$HeapData;->mShallowSize:I

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/ClassObj$HeapData;->mInstances:Ljava/util/List;

    return-void
.end method
