.class public final synthetic Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field public static final synthetic INSTANCE:Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;

    invoke-direct {v0}, Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;-><init>()V

    sput-object v0, Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;->INSTANCE:Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->lambda$new$42(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
