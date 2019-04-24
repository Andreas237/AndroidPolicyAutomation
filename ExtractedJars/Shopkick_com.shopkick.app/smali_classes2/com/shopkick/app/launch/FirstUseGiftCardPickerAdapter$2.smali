.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$2;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerAdapter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->maybeTriggerUpdate(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$2;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$2;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->notifyDataSetChanged()V

    return-void
.end method
