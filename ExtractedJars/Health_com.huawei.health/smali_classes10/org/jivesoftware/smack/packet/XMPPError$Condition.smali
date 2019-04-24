.class public final enum Lorg/jivesoftware/smack/packet/XMPPError$Condition;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/XMPPError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Condition"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/packet/XMPPError$Condition;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum bad_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum conflict:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum feature_not_implemented:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum forbidden:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum gone:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum internal_server_error:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum item_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum jid_malformed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum not_acceptable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum not_allowed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum not_authorized:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum policy_violation:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum recipient_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum redirect:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum registration_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum remote_server_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum remote_server_timeout:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum resource_constraint:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum service_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum subscription_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum undefined_condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field public static final enum unexpected_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 375
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "bad_request"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->bad_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 376
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "conflict"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->conflict:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 377
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "feature_not_implemented"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->feature_not_implemented:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 378
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "forbidden"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->forbidden:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 379
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "gone"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->gone:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 380
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "internal_server_error"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->internal_server_error:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 381
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "item_not_found"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->item_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 382
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "jid_malformed"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->jid_malformed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 383
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "not_acceptable"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_acceptable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 384
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "not_allowed"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_allowed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 385
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "not_authorized"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_authorized:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 386
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "policy_violation"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->policy_violation:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 387
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "recipient_unavailable"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->recipient_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 388
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "redirect"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->redirect:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 389
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "registration_required"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->registration_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 390
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "remote_server_not_found"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->remote_server_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 391
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "remote_server_timeout"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->remote_server_timeout:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 392
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "resource_constraint"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->resource_constraint:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 393
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "service_unavailable"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->service_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 394
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "subscription_required"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->subscription_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 395
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "undefined_condition"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->undefined_condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 396
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const-string v1, "unexpected_request"

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->unexpected_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 374
    const/16 v0, 0x16

    new-array v0, v0, [Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->bad_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->conflict:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->feature_not_implemented:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->forbidden:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->gone:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->internal_server_error:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->item_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->jid_malformed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_acceptable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_allowed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_authorized:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->policy_violation:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->recipient_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->redirect:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->registration_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->remote_server_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->remote_server_timeout:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->resource_constraint:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->service_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->subscription_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->undefined_condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->unexpected_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->$VALUES:[Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 374
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Condition;
    .locals 5

    .line 406
    const-string v0, "xml-not-well-formed"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    const-string p0, "not-well-formed"

    .line 409
    :cond_0
    const/16 v0, 0x2d

    const/16 v1, 0x5f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    .line 410
    const/4 v3, 0x0

    .line 412
    :try_start_0
    invoke-static {p0}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Condition;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 415
    goto :goto_0

    .line 413
    :catch_0
    move-exception v4

    .line 414
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not transform string \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' to XMPPErrorCondition"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 416
    :goto_0
    return-object v3
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Condition;
    .locals 1

    .line 374
    const-class v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/packet/XMPPError$Condition;
    .locals 1

    .line 374
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->$VALUES:[Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/packet/XMPPError$Condition;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 400
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->name()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x5f

    const/16 v2, 0x2d

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
