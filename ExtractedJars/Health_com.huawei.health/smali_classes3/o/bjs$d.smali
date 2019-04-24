.class Lo/bjs$d;
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
    name = "d"
.end annotation


# instance fields
.field private d:Lo/bjw;


# direct methods
.method constructor <init>(Lo/bjw;)V
    .locals 0

    .line 352
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    iput-object p1, p0, Lo/bjs$d;->d:Lo/bjw;

    .line 354
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 359
    iget-object v0, p0, Lo/bjs$d;->d:Lo/bjw;

    if-eqz v0, :cond_0

    .line 361
    iget-object v0, p0, Lo/bjs$d;->d:Lo/bjw;

    invoke-interface {v0}, Lo/bjw;->a()V

    .line 363
    :cond_0
    return-void
.end method
