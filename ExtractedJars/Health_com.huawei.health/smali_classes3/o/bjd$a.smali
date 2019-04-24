.class public Lo/bjd$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bjd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/ImageView;

.field public e:Landroid/widget/CheckBox;

.field i:Landroid/view/View;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 366
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 371
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjd$a;->d:Landroid/widget/ImageView;

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjd$a;->b:Landroid/widget/TextView;

    .line 381
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjd$a;->a:Landroid/widget/TextView;

    .line 386
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjd$a;->c:Landroid/widget/TextView;

    .line 391
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    .line 396
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjd$a;->i:Landroid/view/View;

    return-void
.end method
