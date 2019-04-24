.class final Lcom/huawei/hwid/core/d/l$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/hwid/core/d/l$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/huawei/hwid/core/d/l$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/l;->c(Landroid/content/Context;)V

    .line 156
    return-void
.end method
