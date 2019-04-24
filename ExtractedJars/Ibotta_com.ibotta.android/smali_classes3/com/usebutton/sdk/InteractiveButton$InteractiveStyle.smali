.class public Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;
.super Lcom/usebutton/sdk/internal/views/BaseButton$Style;
.source "InteractiveButton.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/InteractiveButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InteractiveStyle"
.end annotation


# instance fields
.field public inventoryLeftPadding:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/BaseButton$Style;-><init>()V

    return-void
.end method
