.class public Lorg/jivesoftware/smack/packet/XMPPError;
.super Lorg/jivesoftware/smack/packet/AbstractError;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/XMPPError$Condition;,
        Lorg/jivesoftware/smack/packet/XMPPError$Type;,
        Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    }
.end annotation


# static fields
.field private static final CONDITION_TO_TYPE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lorg/jivesoftware/smack/packet/XMPPError$Condition;Lorg/jivesoftware/smack/packet/XMPPError$Type;>;"
        }
    .end annotation
.end field

.field public static final ERROR:Ljava/lang/String; = "error"

.field public static final NAMESPACE:Ljava/lang/String; = "urn:ietf:params:xml:ns:xmpp-stanzas"

.field private static final TAG:Ljava/lang/String; = "XMPPError"


# instance fields
.field private final condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field private final conditionText:Ljava/lang/String;

.field private final errorGenerator:Ljava/lang/String;

.field private final stanza:Lorg/jivesoftware/smack/packet/Stanza;

.field private final type:Lorg/jivesoftware/smack/packet/XMPPError$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 71
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    .line 74
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->bad_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->MODIFY:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->conflict:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->feature_not_implemented:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->forbidden:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->AUTH:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->gone:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->internal_server_error:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->item_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->jid_malformed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->MODIFY:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_acceptable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->MODIFY:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_allowed:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->not_authorized:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->AUTH:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->policy_violation:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->MODIFY:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->recipient_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->WAIT:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->redirect:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->MODIFY:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->registration_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->AUTH:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->remote_server_not_found:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->remote_server_timeout:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->WAIT:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->resource_constraint:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->WAIT:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->service_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->WAIT:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->subscription_required:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->WAIT:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->unexpected_request:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    sget-object v2, Lorg/jivesoftware/smack/packet/XMPPError$Type;->MODIFY:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)V
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 114
    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lorg/jivesoftware/smack/packet/XMPPError;-><init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map;Ljava/util/List;Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 115
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 144
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lorg/jivesoftware/smack/packet/XMPPError;-><init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map;Ljava/util/List;Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 145
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map;Ljava/util/List;Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;Lorg/jivesoftware/smack/packet/Stanza;)V"
        }
    .end annotation

    .line 161
    const-string v0, "urn:ietf:params:xml:ns:xmpp-stanzas"

    invoke-direct {p0, p5, v0, p6}, Lorg/jivesoftware/smack/packet/AbstractError;-><init>(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    .line 162
    const-string v0, "condition must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 163
    iput-object p7, p0, Lorg/jivesoftware/smack/packet/XMPPError;->stanza:Lorg/jivesoftware/smack/packet/Stanza;

    .line 167
    invoke-static {p2}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    const/4 p2, 0x0

    .line 170
    :cond_0
    if-eqz p2, :cond_1

    .line 171
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError$3;->c:[I

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 174
    :sswitch_0
    goto :goto_1

    .line 176
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Condition text can only be set with condtion types \'gone\' and \'redirect\', not "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_1
    :goto_1
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/XMPPError;->conditionText:Ljava/lang/String;

    .line 182
    iput-object p3, p0, Lorg/jivesoftware/smack/packet/XMPPError;->errorGenerator:Ljava/lang/String;

    .line 183
    if-nez p4, :cond_3

    .line 184
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError;->CONDITION_TO_TYPE:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/packet/XMPPError$Type;

    .line 185
    if-nez v3, :cond_2

    .line 186
    const-string v0, "XMPPError"

    const-string v1, "Could not determine type for condition"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    sget-object v3, Lorg/jivesoftware/smack/packet/XMPPError$Type;->CANCEL:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    .line 189
    :cond_2
    iput-object v3, p0, Lorg/jivesoftware/smack/packet/XMPPError;->type:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    .line 190
    goto :goto_2

    .line 191
    :cond_3
    iput-object p4, p0, Lorg/jivesoftware/smack/packet/XMPPError;->type:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    .line 193
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Lorg/jivesoftware/smack/packet/ExtensionElement;)V
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 126
    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x1

    new-array v2, v2, [Lorg/jivesoftware/smack/packet/ExtensionElement;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lorg/jivesoftware/smack/packet/XMPPError;-><init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map;Ljava/util/List;Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 127
    return-void
.end method

.method public static from(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 2

    .line 271
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 272
    const-string v0, "en"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    invoke-static {}, Lorg/jivesoftware/smack/packet/XMPPError;->getBuilder()Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setCondition(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setDescriptiveTexts(Ljava/util/Map;)Lorg/jivesoftware/smack/packet/AbstractError$Builder;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    return-object v0
.end method

.method public static getBuilder()Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 2

    .line 277
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;-><init>(Lorg/jivesoftware/smack/packet/XMPPError$3;)V

    return-object v0
.end method

.method public static getBuilder(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 1

    .line 281
    invoke-static {}, Lorg/jivesoftware/smack/packet/XMPPError;->getBuilder()Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setCondition(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static getBuilder(Lorg/jivesoftware/smack/packet/XMPPError;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 1

    .line 285
    invoke-static {}, Lorg/jivesoftware/smack/packet/XMPPError;->getBuilder()Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->copyFrom(Lorg/jivesoftware/smack/packet/XMPPError;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCondition()Lorg/jivesoftware/smack/packet/XMPPError$Condition;
    .locals 1

    .line 201
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    return-object v0
.end method

.method public getConditionText()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->conditionText:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorGenerator()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->errorGenerator:Ljava/lang/String;

    return-object v0
.end method

.method public getStanza()Lorg/jivesoftware/smack/packet/Stanza;
    .locals 1

    .line 228
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->stanza:Lorg/jivesoftware/smack/packet/Stanza;

    return-object v0
.end method

.method public getType()Lorg/jivesoftware/smack/packet/XMPPError$Type;
    .locals 1

    .line 210
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->type:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 233
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "XMPPError: "

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/XMPPError;->type:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/XMPPError$Type;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->errorGenerator:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 236
    const-string v0, ". Generated by "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/XMPPError;->errorGenerator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 247
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 248
    const-string v0, "error"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 249
    const-string v0, "type"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/XMPPError;->type:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/XMPPError$Type;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 250
    const-string v0, "by"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/XMPPError;->errorGenerator:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 251
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 253
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 254
    const-string v0, "urn:ietf:params:xml:ns:xmpp-stanzas"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 255
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->conditionText:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 256
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 257
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->conditionText:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 258
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/XMPPError;->condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    goto :goto_0

    .line 261
    :cond_0
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeEmptyElement()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 264
    :goto_0
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/XMPPError;->addDescriptiveTextsAndExtensions(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 266
    const-string v0, "error"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 267
    return-object v2
.end method
