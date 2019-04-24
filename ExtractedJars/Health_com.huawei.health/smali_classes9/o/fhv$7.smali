.class final Lo/fhv$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhv;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/fhv$7;->c:Landroid/content/Context;

    iput-object p2, p0, Lo/fhv$7;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 247
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 248
    iget-object v0, p0, Lo/fhv$7;->c:Landroid/content/Context;

    const-string v1, "2"

    iget-object v2, p0, Lo/fhv$7;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/fhv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
