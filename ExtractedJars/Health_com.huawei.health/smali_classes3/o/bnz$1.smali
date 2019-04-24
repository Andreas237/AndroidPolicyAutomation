.class final Lo/bnz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bnz;->b(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lo/bnz$1;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 108
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 110
    iget-object v0, p0, Lo/bnz$1;->b:Landroid/app/Activity;

    invoke-static {v0}, Lo/bnz;->b(Landroid/content/Context;)V

    .line 111
    return-void
.end method
