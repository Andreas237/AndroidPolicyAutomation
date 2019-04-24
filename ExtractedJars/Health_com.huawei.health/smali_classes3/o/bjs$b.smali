.class Lo/bjs$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bjs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Lo/bjw;

.field private e:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lo/bjw;Landroid/widget/EditText;)V
    .locals 0

    .line 327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 328
    iput-object p1, p0, Lo/bjs$b;->d:Lo/bjw;

    .line 329
    iput-object p2, p0, Lo/bjs$b;->e:Landroid/widget/EditText;

    .line 330
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 335
    iget-object v0, p0, Lo/bjs$b;->d:Lo/bjw;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lo/bjs$b;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 338
    invoke-static {v1}, Lo/bjn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 339
    iget-object v0, p0, Lo/bjs$b;->d:Lo/bjw;

    invoke-interface {v0, v1}, Lo/bjw;->a(Ljava/lang/String;)V

    .line 341
    :cond_0
    return-void
.end method
