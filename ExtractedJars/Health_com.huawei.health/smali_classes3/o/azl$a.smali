.class Lo/azl$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/String;

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/azh;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Set<Lo/azh;>;)V"
        }
    .end annotation

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    iput-object p1, p0, Lo/azl$a;->c:Ljava/lang/String;

    .line 186
    iput-object p2, p0, Lo/azl$a;->e:Ljava/util/Set;

    .line 187
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 192
    iget-object v0, p0, Lo/azl$a;->e:Ljava/util/Set;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/azl$a;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 194
    iget-object v0, p0, Lo/azl$a;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/azh;

    .line 196
    if-eqz v2, :cond_0

    .line 198
    iget-object v0, p0, Lo/azl$a;->c:Ljava/lang/String;

    invoke-interface {v2, v0}, Lo/azh;->a(Ljava/lang/String;)V

    .line 200
    :cond_0
    goto :goto_0

    .line 202
    :cond_1
    return-void
.end method
