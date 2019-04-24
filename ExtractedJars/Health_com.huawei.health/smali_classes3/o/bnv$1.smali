.class Lo/bnv$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bnv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bnv;


# direct methods
.method constructor <init>(Lo/bnv;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/bnv$1;->d:Lo/bnv;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 50
    const-string v0, "VoiceRecorderView"

    const-string v1, "change image"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 53
    iget-object v0, p0, Lo/bnv$1;->d:Lo/bnv;

    iget-object v0, v0, Lo/bnv;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bnv$1;->d:Lo/bnv;

    iget-object v1, v1, Lo/bnv;->b:[Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lo/bnv$1;->d:Lo/bnv;

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-static {v2, v3}, Lo/bnv;->b(Lo/bnv;I)I

    move-result v2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    return-void
.end method
