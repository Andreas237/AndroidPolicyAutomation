.class Lo/fjn$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjn;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fjn;


# direct methods
.method constructor <init>(Lo/fjn;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/fjn$4;->d:Lo/fjn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 38
    iget-object v0, p0, Lo/fjn$4;->d:Lo/fjn;

    sget-object v1, Lo/dae;->ev:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lo/fjn;->e(Lo/fjn;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    return-void
.end method
