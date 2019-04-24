.class final Lio/branch/referral/validators/DeepLinkRoutingValidator$3;
.super Ljava/lang/Object;
.source "DeepLinkRoutingValidator.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/validators/DeepLinkRoutingValidator;->validateDeeplinkRouting(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$validate_json:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lio/branch/referral/validators/DeepLinkRoutingValidator$3;->val$validate_json:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 75
    iget-object p1, p0, Lio/branch/referral/validators/DeepLinkRoutingValidator$3;->val$validate_json:Lorg/json/JSONObject;

    const-string p2, "r"

    invoke-static {p1, p2}, Lio/branch/referral/validators/DeepLinkRoutingValidator;->access$000(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-static {p1}, Lio/branch/referral/validators/DeepLinkRoutingValidator;->access$100(Ljava/lang/String;)V

    return-void
.end method
