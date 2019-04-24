.class public final Lo/fod$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private a:Lo/fod;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fod;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fod$e;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fod;>;"
        }
    .end annotation

    .line 176
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lo/fod$e;->d:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/fod;)Lo/fod$e;
    .locals 1

    .line 162
    iget-object v0, p0, Lo/fod$e;->a:Lo/fod;

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lo/fod$e;->a:Lo/fod;

    invoke-interface {v0, p1}, Lo/fod;->b(Lo/fod;)V

    .line 165
    :cond_0
    iget-object v0, p0, Lo/fod$e;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    iput-object p1, p0, Lo/fod$e;->a:Lo/fod;

    .line 167
    return-object p0
.end method
