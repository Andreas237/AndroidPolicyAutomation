.class final Lo/awt$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awt;->c(Lo/awt;Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic c:Landroid/support/v4/util/LongSparseArray;

.field final synthetic e:Lo/awt;


# direct methods
.method constructor <init>(Lo/awt;Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)V
    .locals 0

    .line 450
    iput-object p1, p0, Lo/awt$1;->e:Lo/awt;

    iput-object p2, p0, Lo/awt$1;->a:Ljava/util/List;

    iput-object p3, p0, Lo/awt$1;->c:Landroid/support/v4/util/LongSparseArray;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 450
    invoke-virtual {p0, p1}, Lo/awt$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 455
    iget-object v0, p0, Lo/awt$1;->e:Lo/awt;

    iget-object v1, p0, Lo/awt$1;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lo/awt;->d(Lo/awt;Ljava/util/List;)V

    .line 457
    iget-object v0, p0, Lo/awt$1;->e:Lo/awt;

    iget-object v1, p0, Lo/awt$1;->c:Landroid/support/v4/util/LongSparseArray;

    invoke-static {v0, v1}, Lo/awt;->e(Lo/awt;Landroid/support/v4/util/LongSparseArray;)V

    .line 458
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
