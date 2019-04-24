.class Lo/bdr$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic e:Lo/bdr;


# direct methods
.method private constructor <init>(Lo/bdr;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lo/bdr$d;->e:Lo/bdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bdr;Lo/bdr$5;)V
    .locals 0

    .line 221
    invoke-direct {p0, p1}, Lo/bdr$d;-><init>(Lo/bdr;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 230
    if-nez p2, :cond_0

    .line 232
    iget-object v0, p0, Lo/bdr$d;->e:Lo/bdr;

    invoke-static {v0}, Lo/bdr;->b(Lo/bdr;)V

    goto :goto_0

    .line 234
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 236
    iget-object v0, p0, Lo/bdr$d;->e:Lo/bdr;

    invoke-static {v0}, Lo/bdr;->c(Lo/bdr;)V

    .line 238
    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 239
    return-void
.end method
