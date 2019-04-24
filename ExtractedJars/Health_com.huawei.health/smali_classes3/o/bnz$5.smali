.class final Lo/bnz$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bnz;->b(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 124
    move-object v1, p1

    check-cast v1, Lo/bnz$e;

    .line 125
    invoke-virtual {v1}, Lo/bnz$e;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-static {}, Lo/bnz;->e()V

    .line 130
    :cond_0
    return-void
.end method
