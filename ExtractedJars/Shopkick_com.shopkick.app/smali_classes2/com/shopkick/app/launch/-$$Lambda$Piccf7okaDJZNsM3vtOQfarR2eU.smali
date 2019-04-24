.class public final synthetic Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;


# static fields
.field public static final synthetic INSTANCE:Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    invoke-direct {v0}, Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;-><init>()V

    sput-object v0, Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBtnClickListener(Ljava/lang/ref/WeakReference;)V
    .locals 0

    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method
