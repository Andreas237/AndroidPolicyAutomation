.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;
.super Ljava/lang/Object;
.source "PwiHomePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->showPaymentConfirmation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field showConfirmation:Z

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->ajc$preClinit()V

    return-void
.end method

.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V
    .locals 0

    .line 862
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    .line 863
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->showConfirmation:Z

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "PwiHomePresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onNegativeTapped"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.home.PwiHomePresenterImpl$3"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x367

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method


# virtual methods
.method public onCheckBoxTapped(Z)V
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    .line 875
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->showConfirmation:Z

    return-void
.end method

.method public onNegativeTapped()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_CONFIRM_PAYMENT_CANCELLED:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 871
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method public onPositiveTapped()V
    .locals 2

    .line 866
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$500(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)Lcom/ibotta/android/state/pwi/PwiUserState;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->showConfirmation:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/pwi/PwiUserState;->showConfirmPurchaseAgain(Z)V

    .line 867
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$600(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V

    return-void
.end method
