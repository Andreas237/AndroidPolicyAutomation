.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$-aOHe9tZ4zgJyFvnk2RdcLuAcuE;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void
.end method
