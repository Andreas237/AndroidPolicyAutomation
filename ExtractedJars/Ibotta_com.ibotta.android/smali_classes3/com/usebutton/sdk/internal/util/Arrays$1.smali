.class final Lcom/usebutton/sdk/internal/util/Arrays$1;
.super Ljava/lang/Object;
.source "Arrays.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Arrays$Sink;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/util/Arrays;->flatten(Ljava/util/List;Lcom/usebutton/sdk/internal/util/Arrays$Emitter;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/Arrays$Sink<",
        "TOut;>;"
    }
.end annotation


# instance fields
.field final synthetic val$out:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/Arrays$1;->val$out:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public on(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOut;)V"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Arrays$1;->val$out:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
