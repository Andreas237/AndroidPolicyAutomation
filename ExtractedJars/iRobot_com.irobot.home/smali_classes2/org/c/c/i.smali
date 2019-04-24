.class public final enum Lorg/c/c/i;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/c/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/c/c/i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/c/c/i;

.field public static final enum ACCEPTED:Lorg/c/c/i;

.field public static final enum ALREADY_REPORTED:Lorg/c/c/i;

.field public static final enum BAD_GATEWAY:Lorg/c/c/i;

.field public static final enum BAD_REQUEST:Lorg/c/c/i;

.field public static final enum BANDWIDTH_LIMIT_EXCEEDED:Lorg/c/c/i;

.field public static final enum CHECKPOINT:Lorg/c/c/i;

.field public static final enum CONFLICT:Lorg/c/c/i;

.field public static final enum CONTINUE:Lorg/c/c/i;

.field public static final enum CREATED:Lorg/c/c/i;

.field public static final enum DESTINATION_LOCKED:Lorg/c/c/i;

.field public static final enum EXPECTATION_FAILED:Lorg/c/c/i;

.field public static final enum FAILED_DEPENDENCY:Lorg/c/c/i;

.field public static final enum FORBIDDEN:Lorg/c/c/i;

.field public static final enum FOUND:Lorg/c/c/i;

.field public static final enum GATEWAY_TIMEOUT:Lorg/c/c/i;

.field public static final enum GONE:Lorg/c/c/i;

.field public static final enum HTTP_VERSION_NOT_SUPPORTED:Lorg/c/c/i;

.field public static final enum IM_USED:Lorg/c/c/i;

.field public static final enum INSUFFICIENT_SPACE_ON_RESOURCE:Lorg/c/c/i;

.field public static final enum INSUFFICIENT_STORAGE:Lorg/c/c/i;

.field public static final enum INTERNAL_SERVER_ERROR:Lorg/c/c/i;

.field public static final enum I_AM_A_TEAPOT:Lorg/c/c/i;

.field public static final enum LENGTH_REQUIRED:Lorg/c/c/i;

.field public static final enum LOCKED:Lorg/c/c/i;

.field public static final enum LOOP_DETECTED:Lorg/c/c/i;

.field public static final enum METHOD_FAILURE:Lorg/c/c/i;

.field public static final enum METHOD_NOT_ALLOWED:Lorg/c/c/i;

.field public static final enum MOVED_PERMANENTLY:Lorg/c/c/i;

.field public static final enum MOVED_TEMPORARILY:Lorg/c/c/i;

.field public static final enum MULTIPLE_CHOICES:Lorg/c/c/i;

.field public static final enum MULTI_STATUS:Lorg/c/c/i;

.field public static final enum NETWORK_AUTHENTICATION_REQUIRED:Lorg/c/c/i;

.field public static final enum NON_AUTHORITATIVE_INFORMATION:Lorg/c/c/i;

.field public static final enum NOT_ACCEPTABLE:Lorg/c/c/i;

.field public static final enum NOT_EXTENDED:Lorg/c/c/i;

.field public static final enum NOT_FOUND:Lorg/c/c/i;

.field public static final enum NOT_IMPLEMENTED:Lorg/c/c/i;

.field public static final enum NOT_MODIFIED:Lorg/c/c/i;

.field public static final enum NO_CONTENT:Lorg/c/c/i;

.field public static final enum OK:Lorg/c/c/i;

.field public static final enum PARTIAL_CONTENT:Lorg/c/c/i;

.field public static final enum PAYMENT_REQUIRED:Lorg/c/c/i;

.field public static final enum PRECONDITION_FAILED:Lorg/c/c/i;

.field public static final enum PRECONDITION_REQUIRED:Lorg/c/c/i;

.field public static final enum PROCESSING:Lorg/c/c/i;

.field public static final enum PROXY_AUTHENTICATION_REQUIRED:Lorg/c/c/i;

.field public static final enum REQUESTED_RANGE_NOT_SATISFIABLE:Lorg/c/c/i;

.field public static final enum REQUEST_ENTITY_TOO_LARGE:Lorg/c/c/i;

.field public static final enum REQUEST_HEADER_FIELDS_TOO_LARGE:Lorg/c/c/i;

.field public static final enum REQUEST_TIMEOUT:Lorg/c/c/i;

.field public static final enum REQUEST_URI_TOO_LONG:Lorg/c/c/i;

.field public static final enum RESET_CONTENT:Lorg/c/c/i;

.field public static final enum RESUME_INCOMPLETE:Lorg/c/c/i;

.field public static final enum SEE_OTHER:Lorg/c/c/i;

.field public static final enum SERVICE_UNAVAILABLE:Lorg/c/c/i;

.field public static final enum SWITCHING_PROTOCOLS:Lorg/c/c/i;

.field public static final enum TEMPORARY_REDIRECT:Lorg/c/c/i;

.field public static final enum TOO_MANY_REQUESTS:Lorg/c/c/i;

.field public static final enum UNAUTHORIZED:Lorg/c/c/i;

.field public static final enum UNPROCESSABLE_ENTITY:Lorg/c/c/i;

.field public static final enum UNSUPPORTED_MEDIA_TYPE:Lorg/c/c/i;

.field public static final enum UPGRADE_REQUIRED:Lorg/c/c/i;

.field public static final enum USE_PROXY:Lorg/c/c/i;

.field public static final enum VARIANT_ALSO_NEGOTIATES:Lorg/c/c/i;


# instance fields
.field private final reasonPhrase:Ljava/lang/String;

.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lorg/c/c/i;

    const-string v1, "CONTINUE"

    const-string v2, "Continue"

    const/4 v3, 0x0

    const/16 v4, 0x64

    invoke-direct {v0, v1, v3, v4, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->CONTINUE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "SWITCHING_PROTOCOLS"

    const-string v2, "Switching Protocols"

    const/4 v4, 0x1

    const/16 v5, 0x65

    invoke-direct {v0, v1, v4, v5, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->SWITCHING_PROTOCOLS:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "PROCESSING"

    const-string v2, "Processing"

    const/4 v5, 0x2

    const/16 v6, 0x66

    invoke-direct {v0, v1, v5, v6, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->PROCESSING:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "CHECKPOINT"

    const-string v2, "Checkpoint"

    const/4 v6, 0x3

    const/16 v7, 0x67

    invoke-direct {v0, v1, v6, v7, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->CHECKPOINT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "OK"

    const-string v2, "OK"

    const/4 v7, 0x4

    const/16 v8, 0xc8

    invoke-direct {v0, v1, v7, v8, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->OK:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "CREATED"

    const-string v2, "Created"

    const/4 v8, 0x5

    const/16 v9, 0xc9

    invoke-direct {v0, v1, v8, v9, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->CREATED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "ACCEPTED"

    const-string v2, "Accepted"

    const/4 v9, 0x6

    const/16 v10, 0xca

    invoke-direct {v0, v1, v9, v10, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->ACCEPTED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NON_AUTHORITATIVE_INFORMATION"

    const-string v2, "Non-Authoritative Information"

    const/4 v10, 0x7

    const/16 v11, 0xcb

    invoke-direct {v0, v1, v10, v11, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NON_AUTHORITATIVE_INFORMATION:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NO_CONTENT"

    const-string v2, "No Content"

    const/16 v11, 0x8

    const/16 v12, 0xcc

    invoke-direct {v0, v1, v11, v12, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NO_CONTENT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "RESET_CONTENT"

    const-string v2, "Reset Content"

    const/16 v12, 0x9

    const/16 v13, 0xcd

    invoke-direct {v0, v1, v12, v13, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->RESET_CONTENT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "PARTIAL_CONTENT"

    const-string v2, "Partial Content"

    const/16 v13, 0xa

    const/16 v14, 0xce

    invoke-direct {v0, v1, v13, v14, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->PARTIAL_CONTENT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "MULTI_STATUS"

    const-string v2, "Multi-Status"

    const/16 v14, 0xb

    const/16 v15, 0xcf

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->MULTI_STATUS:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "ALREADY_REPORTED"

    const-string v2, "Already Reported"

    const/16 v15, 0xc

    const/16 v14, 0xd0

    invoke-direct {v0, v1, v15, v14, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->ALREADY_REPORTED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "IM_USED"

    const-string v2, "IM Used"

    const/16 v14, 0xd

    const/16 v15, 0xe2

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->IM_USED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "MULTIPLE_CHOICES"

    const-string v2, "Multiple Choices"

    const/16 v15, 0xe

    const/16 v14, 0x12c

    invoke-direct {v0, v1, v15, v14, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->MULTIPLE_CHOICES:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "MOVED_PERMANENTLY"

    const-string v2, "Moved Permanently"

    const/16 v14, 0xf

    const/16 v15, 0x12d

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->MOVED_PERMANENTLY:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "FOUND"

    const-string v2, "Found"

    const/16 v14, 0x10

    const/16 v15, 0x12e

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->FOUND:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "MOVED_TEMPORARILY"

    const-string v2, "Moved Temporarily"

    const/16 v14, 0x11

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->MOVED_TEMPORARILY:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "SEE_OTHER"

    const-string v2, "See Other"

    const/16 v14, 0x12

    const/16 v15, 0x12f

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->SEE_OTHER:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NOT_MODIFIED"

    const-string v2, "Not Modified"

    const/16 v14, 0x13

    const/16 v15, 0x130

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NOT_MODIFIED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "USE_PROXY"

    const-string v2, "Use Proxy"

    const/16 v14, 0x14

    const/16 v15, 0x131

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->USE_PROXY:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "TEMPORARY_REDIRECT"

    const-string v2, "Temporary Redirect"

    const/16 v14, 0x15

    const/16 v15, 0x133

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->TEMPORARY_REDIRECT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "RESUME_INCOMPLETE"

    const-string v2, "Resume Incomplete"

    const/16 v14, 0x16

    const/16 v15, 0x134

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->RESUME_INCOMPLETE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "BAD_REQUEST"

    const-string v2, "Bad Request"

    const/16 v14, 0x17

    const/16 v15, 0x190

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->BAD_REQUEST:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "UNAUTHORIZED"

    const-string v2, "Unauthorized"

    const/16 v14, 0x18

    const/16 v15, 0x191

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->UNAUTHORIZED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "PAYMENT_REQUIRED"

    const-string v2, "Payment Required"

    const/16 v14, 0x19

    const/16 v15, 0x192

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->PAYMENT_REQUIRED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "FORBIDDEN"

    const-string v2, "Forbidden"

    const/16 v14, 0x1a

    const/16 v15, 0x193

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->FORBIDDEN:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NOT_FOUND"

    const-string v2, "Not Found"

    const/16 v14, 0x1b

    const/16 v15, 0x194

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NOT_FOUND:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "METHOD_NOT_ALLOWED"

    const-string v2, "Method Not Allowed"

    const/16 v14, 0x1c

    const/16 v15, 0x195

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->METHOD_NOT_ALLOWED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NOT_ACCEPTABLE"

    const-string v2, "Not Acceptable"

    const/16 v14, 0x1d

    const/16 v15, 0x196

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NOT_ACCEPTABLE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "PROXY_AUTHENTICATION_REQUIRED"

    const-string v2, "Proxy Authentication Required"

    const/16 v14, 0x1e

    const/16 v15, 0x197

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->PROXY_AUTHENTICATION_REQUIRED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "REQUEST_TIMEOUT"

    const-string v2, "Request Timeout"

    const/16 v14, 0x1f

    const/16 v15, 0x198

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->REQUEST_TIMEOUT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "CONFLICT"

    const-string v2, "Conflict"

    const/16 v14, 0x20

    const/16 v15, 0x199

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->CONFLICT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "GONE"

    const-string v2, "Gone"

    const/16 v14, 0x21

    const/16 v15, 0x19a

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->GONE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "LENGTH_REQUIRED"

    const-string v2, "Length Required"

    const/16 v14, 0x22

    const/16 v15, 0x19b

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->LENGTH_REQUIRED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "PRECONDITION_FAILED"

    const-string v2, "Precondition Failed"

    const/16 v14, 0x23

    const/16 v15, 0x19c

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->PRECONDITION_FAILED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "REQUEST_ENTITY_TOO_LARGE"

    const-string v2, "Request Entity Too Large"

    const/16 v14, 0x24

    const/16 v15, 0x19d

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->REQUEST_ENTITY_TOO_LARGE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "REQUEST_URI_TOO_LONG"

    const-string v2, "Request-URI Too Long"

    const/16 v14, 0x25

    const/16 v15, 0x19e

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->REQUEST_URI_TOO_LONG:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "UNSUPPORTED_MEDIA_TYPE"

    const-string v2, "Unsupported Media Type"

    const/16 v14, 0x26

    const/16 v15, 0x19f

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->UNSUPPORTED_MEDIA_TYPE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "REQUESTED_RANGE_NOT_SATISFIABLE"

    const-string v2, "Requested range not satisfiable"

    const/16 v14, 0x27

    const/16 v15, 0x1a0

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->REQUESTED_RANGE_NOT_SATISFIABLE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "EXPECTATION_FAILED"

    const-string v2, "Expectation Failed"

    const/16 v14, 0x28

    const/16 v15, 0x1a1

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->EXPECTATION_FAILED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "I_AM_A_TEAPOT"

    const-string v2, "I\'m a teapot"

    const/16 v14, 0x29

    const/16 v15, 0x1a2

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->I_AM_A_TEAPOT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "INSUFFICIENT_SPACE_ON_RESOURCE"

    const-string v2, "Insufficient Space On Resource"

    const/16 v14, 0x2a

    const/16 v15, 0x1a3

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->INSUFFICIENT_SPACE_ON_RESOURCE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "METHOD_FAILURE"

    const-string v2, "Method Failure"

    const/16 v14, 0x2b

    const/16 v15, 0x1a4

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->METHOD_FAILURE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "DESTINATION_LOCKED"

    const-string v2, "Destination Locked"

    const/16 v14, 0x2c

    const/16 v15, 0x1a5

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->DESTINATION_LOCKED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "UNPROCESSABLE_ENTITY"

    const-string v2, "Unprocessable Entity"

    const/16 v14, 0x2d

    const/16 v15, 0x1a6

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->UNPROCESSABLE_ENTITY:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "LOCKED"

    const-string v2, "Locked"

    const/16 v14, 0x2e

    const/16 v15, 0x1a7

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->LOCKED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "FAILED_DEPENDENCY"

    const-string v2, "Failed Dependency"

    const/16 v14, 0x2f

    const/16 v15, 0x1a8

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->FAILED_DEPENDENCY:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "UPGRADE_REQUIRED"

    const-string v2, "Upgrade Required"

    const/16 v14, 0x30

    const/16 v15, 0x1aa

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->UPGRADE_REQUIRED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "PRECONDITION_REQUIRED"

    const-string v2, "Precondition Required"

    const/16 v14, 0x31

    const/16 v15, 0x1ac

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->PRECONDITION_REQUIRED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "TOO_MANY_REQUESTS"

    const-string v2, "Too Many Requests"

    const/16 v14, 0x32

    const/16 v15, 0x1ad

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->TOO_MANY_REQUESTS:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "REQUEST_HEADER_FIELDS_TOO_LARGE"

    const-string v2, "Request Header Fields Too Large"

    const/16 v14, 0x33

    const/16 v15, 0x1af

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->REQUEST_HEADER_FIELDS_TOO_LARGE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "INTERNAL_SERVER_ERROR"

    const-string v2, "Internal Server Error"

    const/16 v14, 0x34

    const/16 v15, 0x1f4

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->INTERNAL_SERVER_ERROR:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NOT_IMPLEMENTED"

    const-string v2, "Not Implemented"

    const/16 v14, 0x35

    const/16 v15, 0x1f5

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NOT_IMPLEMENTED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "BAD_GATEWAY"

    const-string v2, "Bad Gateway"

    const/16 v14, 0x36

    const/16 v15, 0x1f6

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->BAD_GATEWAY:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "SERVICE_UNAVAILABLE"

    const-string v2, "Service Unavailable"

    const/16 v14, 0x37

    const/16 v15, 0x1f7

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->SERVICE_UNAVAILABLE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "GATEWAY_TIMEOUT"

    const-string v2, "Gateway Timeout"

    const/16 v14, 0x38

    const/16 v15, 0x1f8

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->GATEWAY_TIMEOUT:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "HTTP_VERSION_NOT_SUPPORTED"

    const-string v2, "HTTP Version not supported"

    const/16 v14, 0x39

    const/16 v15, 0x1f9

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->HTTP_VERSION_NOT_SUPPORTED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "VARIANT_ALSO_NEGOTIATES"

    const-string v2, "Variant Also Negotiates"

    const/16 v14, 0x3a

    const/16 v15, 0x1fa

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->VARIANT_ALSO_NEGOTIATES:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "INSUFFICIENT_STORAGE"

    const-string v2, "Insufficient Storage"

    const/16 v14, 0x3b

    const/16 v15, 0x1fb

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->INSUFFICIENT_STORAGE:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "LOOP_DETECTED"

    const-string v2, "Loop Detected"

    const/16 v14, 0x3c

    const/16 v15, 0x1fc

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->LOOP_DETECTED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "BANDWIDTH_LIMIT_EXCEEDED"

    const-string v2, "Bandwidth Limit Exceeded"

    const/16 v14, 0x3d

    const/16 v15, 0x1fd

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->BANDWIDTH_LIMIT_EXCEEDED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NOT_EXTENDED"

    const-string v2, "Not Extended"

    const/16 v14, 0x3e

    const/16 v15, 0x1fe

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NOT_EXTENDED:Lorg/c/c/i;

    new-instance v0, Lorg/c/c/i;

    const-string v1, "NETWORK_AUTHENTICATION_REQUIRED"

    const-string v2, "Network Authentication Required"

    const/16 v14, 0x3f

    const/16 v15, 0x1ff

    invoke-direct {v0, v1, v14, v15, v2}, Lorg/c/c/i;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lorg/c/c/i;->NETWORK_AUTHENTICATION_REQUIRED:Lorg/c/c/i;

    const/16 v0, 0x40

    new-array v0, v0, [Lorg/c/c/i;

    sget-object v1, Lorg/c/c/i;->CONTINUE:Lorg/c/c/i;

    aput-object v1, v0, v3

    sget-object v1, Lorg/c/c/i;->SWITCHING_PROTOCOLS:Lorg/c/c/i;

    aput-object v1, v0, v4

    sget-object v1, Lorg/c/c/i;->PROCESSING:Lorg/c/c/i;

    aput-object v1, v0, v5

    sget-object v1, Lorg/c/c/i;->CHECKPOINT:Lorg/c/c/i;

    aput-object v1, v0, v6

    sget-object v1, Lorg/c/c/i;->OK:Lorg/c/c/i;

    aput-object v1, v0, v7

    sget-object v1, Lorg/c/c/i;->CREATED:Lorg/c/c/i;

    aput-object v1, v0, v8

    sget-object v1, Lorg/c/c/i;->ACCEPTED:Lorg/c/c/i;

    aput-object v1, v0, v9

    sget-object v1, Lorg/c/c/i;->NON_AUTHORITATIVE_INFORMATION:Lorg/c/c/i;

    aput-object v1, v0, v10

    sget-object v1, Lorg/c/c/i;->NO_CONTENT:Lorg/c/c/i;

    aput-object v1, v0, v11

    sget-object v1, Lorg/c/c/i;->RESET_CONTENT:Lorg/c/c/i;

    aput-object v1, v0, v12

    sget-object v1, Lorg/c/c/i;->PARTIAL_CONTENT:Lorg/c/c/i;

    aput-object v1, v0, v13

    sget-object v1, Lorg/c/c/i;->MULTI_STATUS:Lorg/c/c/i;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->ALREADY_REPORTED:Lorg/c/c/i;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->IM_USED:Lorg/c/c/i;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->MULTIPLE_CHOICES:Lorg/c/c/i;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->MOVED_PERMANENTLY:Lorg/c/c/i;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->FOUND:Lorg/c/c/i;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->MOVED_TEMPORARILY:Lorg/c/c/i;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->SEE_OTHER:Lorg/c/c/i;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->NOT_MODIFIED:Lorg/c/c/i;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->USE_PROXY:Lorg/c/c/i;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->TEMPORARY_REDIRECT:Lorg/c/c/i;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->RESUME_INCOMPLETE:Lorg/c/c/i;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->BAD_REQUEST:Lorg/c/c/i;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->UNAUTHORIZED:Lorg/c/c/i;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->PAYMENT_REQUIRED:Lorg/c/c/i;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->FORBIDDEN:Lorg/c/c/i;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->NOT_FOUND:Lorg/c/c/i;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->METHOD_NOT_ALLOWED:Lorg/c/c/i;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->NOT_ACCEPTABLE:Lorg/c/c/i;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->PROXY_AUTHENTICATION_REQUIRED:Lorg/c/c/i;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->REQUEST_TIMEOUT:Lorg/c/c/i;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->CONFLICT:Lorg/c/c/i;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->GONE:Lorg/c/c/i;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->LENGTH_REQUIRED:Lorg/c/c/i;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->PRECONDITION_FAILED:Lorg/c/c/i;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->REQUEST_ENTITY_TOO_LARGE:Lorg/c/c/i;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->REQUEST_URI_TOO_LONG:Lorg/c/c/i;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->UNSUPPORTED_MEDIA_TYPE:Lorg/c/c/i;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->REQUESTED_RANGE_NOT_SATISFIABLE:Lorg/c/c/i;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->EXPECTATION_FAILED:Lorg/c/c/i;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->I_AM_A_TEAPOT:Lorg/c/c/i;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->INSUFFICIENT_SPACE_ON_RESOURCE:Lorg/c/c/i;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->METHOD_FAILURE:Lorg/c/c/i;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->DESTINATION_LOCKED:Lorg/c/c/i;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->UNPROCESSABLE_ENTITY:Lorg/c/c/i;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->LOCKED:Lorg/c/c/i;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->FAILED_DEPENDENCY:Lorg/c/c/i;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->UPGRADE_REQUIRED:Lorg/c/c/i;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->PRECONDITION_REQUIRED:Lorg/c/c/i;

    const/16 v2, 0x31

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->TOO_MANY_REQUESTS:Lorg/c/c/i;

    const/16 v2, 0x32

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->REQUEST_HEADER_FIELDS_TOO_LARGE:Lorg/c/c/i;

    const/16 v2, 0x33

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->INTERNAL_SERVER_ERROR:Lorg/c/c/i;

    const/16 v2, 0x34

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->NOT_IMPLEMENTED:Lorg/c/c/i;

    const/16 v2, 0x35

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->BAD_GATEWAY:Lorg/c/c/i;

    const/16 v2, 0x36

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->SERVICE_UNAVAILABLE:Lorg/c/c/i;

    const/16 v2, 0x37

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->GATEWAY_TIMEOUT:Lorg/c/c/i;

    const/16 v2, 0x38

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->HTTP_VERSION_NOT_SUPPORTED:Lorg/c/c/i;

    const/16 v2, 0x39

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->VARIANT_ALSO_NEGOTIATES:Lorg/c/c/i;

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->INSUFFICIENT_STORAGE:Lorg/c/c/i;

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->LOOP_DETECTED:Lorg/c/c/i;

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->BANDWIDTH_LIMIT_EXCEEDED:Lorg/c/c/i;

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->NOT_EXTENDED:Lorg/c/c/i;

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i;->NETWORK_AUTHENTICATION_REQUIRED:Lorg/c/c/i;

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    sput-object v0, Lorg/c/c/i;->$VALUES:[Lorg/c/c/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lorg/c/c/i;->value:I

    iput-object p4, p0, Lorg/c/c/i;->reasonPhrase:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(I)Lorg/c/c/i;
    .locals 5

    invoke-static {}, Lorg/c/c/i;->values()[Lorg/c/c/i;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lorg/c/c/i;->value:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No matching constant for ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/c/c/i;
    .locals 1

    const-class v0, Lorg/c/c/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/c/c/i;

    return-object p0
.end method

.method public static values()[Lorg/c/c/i;
    .locals 1

    sget-object v0, Lorg/c/c/i;->$VALUES:[Lorg/c/c/i;

    invoke-virtual {v0}, [Lorg/c/c/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/c/c/i;

    return-object v0
.end method


# virtual methods
.method public getReasonPhrase()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/c/i;->reasonPhrase:Ljava/lang/String;

    return-object v0
.end method

.method public series()Lorg/c/c/i$a;
    .locals 1

    invoke-static {p0}, Lorg/c/c/i$a;->access$000(Lorg/c/c/i;)Lorg/c/c/i$a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lorg/c/c/i;->value:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public value()I
    .locals 1

    iget v0, p0, Lorg/c/c/i;->value:I

    return v0
.end method
