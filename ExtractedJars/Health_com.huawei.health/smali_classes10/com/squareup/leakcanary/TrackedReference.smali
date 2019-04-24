.class public Lcom/squareup/leakcanary/TrackedReference;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final className:Ljava/lang/String;

.field public final fields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field public final key:Ljava/lang/String;

.field public final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/squareup/leakcanary/TrackedReference;->key:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lcom/squareup/leakcanary/TrackedReference;->name:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lcom/squareup/leakcanary/TrackedReference;->className:Ljava/lang/String;

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/leakcanary/TrackedReference;->fields:Ljava/util/List;

    .line 30
    return-void
.end method
