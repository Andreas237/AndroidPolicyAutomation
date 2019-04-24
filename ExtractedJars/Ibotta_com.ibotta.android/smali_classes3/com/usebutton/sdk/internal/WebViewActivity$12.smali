.class synthetic Lcom/usebutton/sdk/internal/WebViewActivity$12;
.super Ljava/lang/Object;
.source "WebViewActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$usebutton$thirdparty$com$flipboard$bottomsheet$BottomSheetLayout$State:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 308
    invoke-static {}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->values()[Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/usebutton/sdk/internal/WebViewActivity$12;->$SwitchMap$com$usebutton$thirdparty$com$flipboard$bottomsheet$BottomSheetLayout$State:[I

    :try_start_0
    sget-object v0, Lcom/usebutton/sdk/internal/WebViewActivity$12;->$SwitchMap$com$usebutton$thirdparty$com$flipboard$bottomsheet$BottomSheetLayout$State:[I

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-virtual {v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/usebutton/sdk/internal/WebViewActivity$12;->$SwitchMap$com$usebutton$thirdparty$com$flipboard$bottomsheet$BottomSheetLayout$State:[I

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-virtual {v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
