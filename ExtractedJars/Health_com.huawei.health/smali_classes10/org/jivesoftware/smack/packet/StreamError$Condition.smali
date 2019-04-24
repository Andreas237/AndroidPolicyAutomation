.class public final enum Lorg/jivesoftware/smack/packet/StreamError$Condition;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/StreamError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Condition"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/packet/StreamError$Condition;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum bad_format:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum bad_namespace_prefix:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum conflict:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum connection_timeout:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum host_gone:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum host_unknown:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum improper_addressing:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum internal_server_error:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum invalid_from:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum invalid_id:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum invalid_namespace:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum invalid_xml:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum not_authorized:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum not_well_formed:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum policy_violation:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum remote_connection_failed:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum reset:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum resource_constraint:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum restricted_xml:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum see_other_host:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum system_shutdown:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum undeficed_condition:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum unsupported_encoding:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum unsupported_feature:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum unsupported_stanza_type:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field public static final enum unsupported_version:Lorg/jivesoftware/smack/packet/StreamError$Condition;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 159
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "bad_format"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->bad_format:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 160
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "bad_namespace_prefix"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->bad_namespace_prefix:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 161
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "conflict"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->conflict:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 162
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "connection_timeout"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->connection_timeout:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 163
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "host_gone"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->host_gone:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 164
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "host_unknown"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->host_unknown:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 165
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "improper_addressing"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->improper_addressing:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 166
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "internal_server_error"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->internal_server_error:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 167
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "invalid_from"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_from:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 168
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "invalid_namespace"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_namespace:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 169
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "invalid_xml"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_xml:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 170
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "not_authorized"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->not_authorized:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 171
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "not_well_formed"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->not_well_formed:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 172
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "policy_violation"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->policy_violation:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 173
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "remote_connection_failed"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->remote_connection_failed:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 174
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "reset"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->reset:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 175
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "resource_constraint"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->resource_constraint:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 176
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "restricted_xml"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->restricted_xml:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 177
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "see_other_host"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->see_other_host:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 178
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "system_shutdown"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->system_shutdown:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 179
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "undeficed_condition"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->undeficed_condition:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 180
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "unsupported_encoding"

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_encoding:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 181
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "unsupported_feature"

    const/16 v2, 0x16

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_feature:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 182
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "unsupported_stanza_type"

    const/16 v2, 0x17

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_stanza_type:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 183
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "unsupported_version"

    const/16 v2, 0x18

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_version:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 184
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const-string v1, "invalid_id"

    const/16 v2, 0x19

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/StreamError$Condition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_id:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 158
    const/16 v0, 0x1a

    new-array v0, v0, [Lorg/jivesoftware/smack/packet/StreamError$Condition;

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->bad_format:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->bad_namespace_prefix:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->conflict:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->connection_timeout:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->host_gone:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->host_unknown:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->improper_addressing:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->internal_server_error:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_from:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_namespace:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_xml:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->not_authorized:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->not_well_formed:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->policy_violation:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->remote_connection_failed:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->reset:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->resource_constraint:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->restricted_xml:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->see_other_host:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->system_shutdown:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->undeficed_condition:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_encoding:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_feature:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_stanza_type:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_version:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_id:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->$VALUES:[Lorg/jivesoftware/smack/packet/StreamError$Condition;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 158
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StreamError$Condition;
    .locals 5

    .line 192
    const/16 v0, 0x2d

    const/16 v1, 0x5f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    .line 193
    const/4 v3, 0x0

    .line 195
    :try_start_0
    invoke-static {p0}, Lorg/jivesoftware/smack/packet/StreamError$Condition;->valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StreamError$Condition;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 199
    goto :goto_0

    .line 196
    :catch_0
    move-exception v4

    .line 197
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

    .line 200
    :goto_0
    return-object v3
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StreamError$Condition;
    .locals 1

    .line 158
    const-class v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/packet/StreamError$Condition;
    .locals 1

    .line 158
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->$VALUES:[Lorg/jivesoftware/smack/packet/StreamError$Condition;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/packet/StreamError$Condition;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/packet/StreamError$Condition;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 188
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/StreamError$Condition;->name()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x5f

    const/16 v2, 0x2d

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
