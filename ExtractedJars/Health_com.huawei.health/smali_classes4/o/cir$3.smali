.class Lo/cir$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fkk;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 773
    iput-object p1, p0, Lo/cir$3;->d:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 781
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openTingChannel is onError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 783
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 776
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openTingChannel is onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    return-void
.end method
