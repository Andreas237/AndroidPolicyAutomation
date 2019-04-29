.class Lcom/rt/mobile/english/ui/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/MainActivity;->openUrl(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/MainActivity;

.field final synthetic val$language:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity$1;->this$0:Lcom/rt/mobile/english/ui/MainActivity;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/MainActivity$1;->val$language:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 174
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 175
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity$1;->this$0:Lcom/rt/mobile/english/ui/MainActivity;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/MainActivity$1;->val$language:Ljava/lang/String;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity$1;->this$0:Lcom/rt/mobile/english/ui/MainActivity;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/rt/mobile/english/data/EditionManager;->changeEdition(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V

    return-void
.end method
