.class Lo/alt$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alt;->d(Lo/ala;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/alt;


# direct methods
.method constructor <init>(Lo/alt;Landroid/os/Looper;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lo/alt$4;->e:Lo/alt;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 286
    iget-object v0, p0, Lo/alt$4;->e:Lo/alt;

    invoke-static {v0, p1}, Lo/alt;->d(Lo/alt;Landroid/os/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 287
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 289
    :cond_0
    return-void
.end method
