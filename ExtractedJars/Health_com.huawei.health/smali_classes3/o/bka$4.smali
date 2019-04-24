.class Lo/bka$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bka;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bka;


# direct methods
.method constructor <init>(Lo/bka;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/bka$4;->d:Lo/bka;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 165
    iget-object v0, p0, Lo/bka$4;->d:Lo/bka;

    invoke-static {v0}, Lo/bka;->e(Lo/bka;)V

    .line 166
    return-void
.end method
