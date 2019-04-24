.class Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog$1;
.super Ljava/lang/Object;
.source "RebatesFoundDialog.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->initLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->dismiss()V

    return-void
.end method
