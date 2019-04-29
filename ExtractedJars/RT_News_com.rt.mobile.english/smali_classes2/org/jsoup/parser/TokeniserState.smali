.class abstract enum Lorg/jsoup/parser/TokeniserState;
.super Ljava/lang/Enum;
.source "TokeniserState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jsoup/parser/TokeniserState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jsoup/parser/TokeniserState;

.field public static final enum AfterAttributeName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AfterAttributeValue_quoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AfterDoctypeName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AfterDoctypePublicIdentifier:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AfterDoctypePublicKeyword:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AfterDoctypeSystemIdentifier:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AfterDoctypeSystemKeyword:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AttributeName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AttributeValue_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AttributeValue_singleQuoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum AttributeValue_unquoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BeforeAttributeName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BeforeAttributeValue:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BeforeDoctypeName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BeforeDoctypePublicIdentifier:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BeforeDoctypeSystemIdentifier:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BetweenDoctypePublicAndSystemIdentifiers:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BogusComment:Lorg/jsoup/parser/TokeniserState;

.field public static final enum BogusDoctype:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CdataSection:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CharacterReferenceInData:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CharacterReferenceInRcdata:Lorg/jsoup/parser/TokeniserState;

.field public static final enum Comment:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CommentEnd:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CommentEndBang:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CommentEndDash:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CommentStart:Lorg/jsoup/parser/TokeniserState;

.field public static final enum CommentStartDash:Lorg/jsoup/parser/TokeniserState;

.field public static final enum Data:Lorg/jsoup/parser/TokeniserState;

.field public static final enum Doctype:Lorg/jsoup/parser/TokeniserState;

.field public static final enum DoctypeName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum DoctypePublicIdentifier_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum DoctypePublicIdentifier_singleQuoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum DoctypeSystemIdentifier_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum DoctypeSystemIdentifier_singleQuoted:Lorg/jsoup/parser/TokeniserState;

.field public static final enum EndTagOpen:Lorg/jsoup/parser/TokeniserState;

.field public static final enum MarkupDeclarationOpen:Lorg/jsoup/parser/TokeniserState;

.field public static final enum PLAINTEXT:Lorg/jsoup/parser/TokeniserState;

.field public static final enum RCDATAEndTagName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum RCDATAEndTagOpen:Lorg/jsoup/parser/TokeniserState;

.field public static final enum Rawtext:Lorg/jsoup/parser/TokeniserState;

.field public static final enum RawtextEndTagName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum RawtextEndTagOpen:Lorg/jsoup/parser/TokeniserState;

.field public static final enum RawtextLessthanSign:Lorg/jsoup/parser/TokeniserState;

.field public static final enum Rcdata:Lorg/jsoup/parser/TokeniserState;

.field public static final enum RcdataLessthanSign:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptData:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataDoubleEscapeEnd:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataDoubleEscapeStart:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataDoubleEscaped:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataDoubleEscapedDash:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataDoubleEscapedDashDash:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataDoubleEscapedLessthanSign:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEndTagName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEndTagOpen:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscapeStart:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscapeStartDash:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscaped:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscapedDash:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscapedDashDash:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscapedEndTagName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscapedEndTagOpen:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataEscapedLessthanSign:Lorg/jsoup/parser/TokeniserState;

.field public static final enum ScriptDataLessthanSign:Lorg/jsoup/parser/TokeniserState;

.field public static final enum SelfClosingStartTag:Lorg/jsoup/parser/TokeniserState;

.field public static final enum TagName:Lorg/jsoup/parser/TokeniserState;

.field public static final enum TagOpen:Lorg/jsoup/parser/TokeniserState;

.field private static final eof:C = '\uffff'

.field private static final nullChar:C = '\u0000'

.field private static final replacementChar:C = '\ufffd'

.field private static final replacementStr:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 7
    new-instance v0, Lorg/jsoup/parser/TokeniserState$1;

    const-string v1, "Data"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jsoup/parser/TokeniserState$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->Data:Lorg/jsoup/parser/TokeniserState;

    .line 31
    new-instance v0, Lorg/jsoup/parser/TokeniserState$2;

    const-string v1, "CharacterReferenceInData"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/jsoup/parser/TokeniserState$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CharacterReferenceInData:Lorg/jsoup/parser/TokeniserState;

    .line 42
    new-instance v0, Lorg/jsoup/parser/TokeniserState$3;

    const-string v1, "Rcdata"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/jsoup/parser/TokeniserState$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->Rcdata:Lorg/jsoup/parser/TokeniserState;

    .line 67
    new-instance v0, Lorg/jsoup/parser/TokeniserState$4;

    const-string v1, "CharacterReferenceInRcdata"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/jsoup/parser/TokeniserState$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CharacterReferenceInRcdata:Lorg/jsoup/parser/TokeniserState;

    .line 77
    new-instance v0, Lorg/jsoup/parser/TokeniserState$5;

    const-string v1, "Rawtext"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lorg/jsoup/parser/TokeniserState$5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->Rawtext:Lorg/jsoup/parser/TokeniserState;

    .line 98
    new-instance v0, Lorg/jsoup/parser/TokeniserState$6;

    const-string v1, "ScriptData"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lorg/jsoup/parser/TokeniserState$6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptData:Lorg/jsoup/parser/TokeniserState;

    .line 119
    new-instance v0, Lorg/jsoup/parser/TokeniserState$7;

    const-string v1, "PLAINTEXT"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lorg/jsoup/parser/TokeniserState$7;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->PLAINTEXT:Lorg/jsoup/parser/TokeniserState;

    .line 137
    new-instance v0, Lorg/jsoup/parser/TokeniserState$8;

    const-string v1, "TagOpen"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lorg/jsoup/parser/TokeniserState$8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->TagOpen:Lorg/jsoup/parser/TokeniserState;

    .line 163
    new-instance v0, Lorg/jsoup/parser/TokeniserState$9;

    const-string v1, "EndTagOpen"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lorg/jsoup/parser/TokeniserState$9;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->EndTagOpen:Lorg/jsoup/parser/TokeniserState;

    .line 181
    new-instance v0, Lorg/jsoup/parser/TokeniserState$10;

    const-string v1, "TagName"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lorg/jsoup/parser/TokeniserState$10;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->TagName:Lorg/jsoup/parser/TokeniserState;

    .line 213
    new-instance v0, Lorg/jsoup/parser/TokeniserState$11;

    const-string v1, "RcdataLessthanSign"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lorg/jsoup/parser/TokeniserState$11;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->RcdataLessthanSign:Lorg/jsoup/parser/TokeniserState;

    .line 232
    new-instance v0, Lorg/jsoup/parser/TokeniserState$12;

    const-string v1, "RCDATAEndTagOpen"

    const/16 v13, 0xb

    invoke-direct {v0, v1, v13}, Lorg/jsoup/parser/TokeniserState$12;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->RCDATAEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    .line 245
    new-instance v0, Lorg/jsoup/parser/TokeniserState$13;

    const-string v1, "RCDATAEndTagName"

    const/16 v14, 0xc

    invoke-direct {v0, v1, v14}, Lorg/jsoup/parser/TokeniserState$13;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->RCDATAEndTagName:Lorg/jsoup/parser/TokeniserState;

    .line 291
    new-instance v0, Lorg/jsoup/parser/TokeniserState$14;

    const-string v1, "RawtextLessthanSign"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$14;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->RawtextLessthanSign:Lorg/jsoup/parser/TokeniserState;

    .line 302
    new-instance v0, Lorg/jsoup/parser/TokeniserState$15;

    const-string v1, "RawtextEndTagOpen"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$15;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->RawtextEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    .line 313
    new-instance v0, Lorg/jsoup/parser/TokeniserState$16;

    const-string v1, "RawtextEndTagName"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$16;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->RawtextEndTagName:Lorg/jsoup/parser/TokeniserState;

    .line 318
    new-instance v0, Lorg/jsoup/parser/TokeniserState$17;

    const-string v1, "ScriptDataLessthanSign"

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$17;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataLessthanSign:Lorg/jsoup/parser/TokeniserState;

    .line 336
    new-instance v0, Lorg/jsoup/parser/TokeniserState$18;

    const-string v1, "ScriptDataEndTagOpen"

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$18;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    .line 348
    new-instance v0, Lorg/jsoup/parser/TokeniserState$19;

    const-string v1, "ScriptDataEndTagName"

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$19;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEndTagName:Lorg/jsoup/parser/TokeniserState;

    .line 353
    new-instance v0, Lorg/jsoup/parser/TokeniserState$20;

    const-string v1, "ScriptDataEscapeStart"

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapeStart:Lorg/jsoup/parser/TokeniserState;

    .line 363
    new-instance v0, Lorg/jsoup/parser/TokeniserState$21;

    const-string v1, "ScriptDataEscapeStartDash"

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$21;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapeStartDash:Lorg/jsoup/parser/TokeniserState;

    .line 373
    new-instance v0, Lorg/jsoup/parser/TokeniserState$22;

    const-string v1, "ScriptDataEscaped"

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$22;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscaped:Lorg/jsoup/parser/TokeniserState;

    .line 400
    new-instance v0, Lorg/jsoup/parser/TokeniserState$23;

    const-string v1, "ScriptDataEscapedDash"

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$23;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedDash:Lorg/jsoup/parser/TokeniserState;

    .line 428
    new-instance v0, Lorg/jsoup/parser/TokeniserState$24;

    const-string v1, "ScriptDataEscapedDashDash"

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$24;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedDashDash:Lorg/jsoup/parser/TokeniserState;

    .line 459
    new-instance v0, Lorg/jsoup/parser/TokeniserState$25;

    const-string v1, "ScriptDataEscapedLessthanSign"

    const/16 v15, 0x18

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$25;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedLessthanSign:Lorg/jsoup/parser/TokeniserState;

    .line 475
    new-instance v0, Lorg/jsoup/parser/TokeniserState$26;

    const-string v1, "ScriptDataEscapedEndTagOpen"

    const/16 v15, 0x19

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$26;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    .line 488
    new-instance v0, Lorg/jsoup/parser/TokeniserState$27;

    const-string v1, "ScriptDataEscapedEndTagName"

    const/16 v15, 0x1a

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$27;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedEndTagName:Lorg/jsoup/parser/TokeniserState;

    .line 493
    new-instance v0, Lorg/jsoup/parser/TokeniserState$28;

    const-string v1, "ScriptDataDoubleEscapeStart"

    const/16 v15, 0x1b

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$28;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapeStart:Lorg/jsoup/parser/TokeniserState;

    .line 498
    new-instance v0, Lorg/jsoup/parser/TokeniserState$29;

    const-string v1, "ScriptDataDoubleEscaped"

    const/16 v15, 0x1c

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$29;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscaped:Lorg/jsoup/parser/TokeniserState;

    .line 525
    new-instance v0, Lorg/jsoup/parser/TokeniserState$30;

    const-string v1, "ScriptDataDoubleEscapedDash"

    const/16 v15, 0x1d

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$30;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapedDash:Lorg/jsoup/parser/TokeniserState;

    .line 552
    new-instance v0, Lorg/jsoup/parser/TokeniserState$31;

    const-string v1, "ScriptDataDoubleEscapedDashDash"

    const/16 v15, 0x1e

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$31;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapedDashDash:Lorg/jsoup/parser/TokeniserState;

    .line 582
    new-instance v0, Lorg/jsoup/parser/TokeniserState$32;

    const-string v1, "ScriptDataDoubleEscapedLessthanSign"

    const/16 v15, 0x1f

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$32;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapedLessthanSign:Lorg/jsoup/parser/TokeniserState;

    .line 593
    new-instance v0, Lorg/jsoup/parser/TokeniserState$33;

    const-string v1, "ScriptDataDoubleEscapeEnd"

    const/16 v15, 0x20

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$33;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapeEnd:Lorg/jsoup/parser/TokeniserState;

    .line 598
    new-instance v0, Lorg/jsoup/parser/TokeniserState$34;

    const-string v1, "BeforeAttributeName"

    const/16 v15, 0x21

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$34;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BeforeAttributeName:Lorg/jsoup/parser/TokeniserState;

    .line 642
    new-instance v0, Lorg/jsoup/parser/TokeniserState$35;

    const-string v1, "AttributeName"

    const/16 v15, 0x22

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$35;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AttributeName:Lorg/jsoup/parser/TokeniserState;

    .line 684
    new-instance v0, Lorg/jsoup/parser/TokeniserState$36;

    const-string v1, "AfterAttributeName"

    const/16 v15, 0x23

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$36;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AfterAttributeName:Lorg/jsoup/parser/TokeniserState;

    .line 729
    new-instance v0, Lorg/jsoup/parser/TokeniserState$37;

    const-string v1, "BeforeAttributeValue"

    const/16 v15, 0x24

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$37;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BeforeAttributeValue:Lorg/jsoup/parser/TokeniserState;

    .line 777
    new-instance v0, Lorg/jsoup/parser/TokeniserState$38;

    const-string v1, "AttributeValue_doubleQuoted"

    const/16 v15, 0x25

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$38;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AttributeValue_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

    .line 807
    new-instance v0, Lorg/jsoup/parser/TokeniserState$39;

    const-string v1, "AttributeValue_singleQuoted"

    const/16 v15, 0x26

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$39;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AttributeValue_singleQuoted:Lorg/jsoup/parser/TokeniserState;

    .line 837
    new-instance v0, Lorg/jsoup/parser/TokeniserState$40;

    const-string v1, "AttributeValue_unquoted"

    const/16 v15, 0x27

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$40;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AttributeValue_unquoted:Lorg/jsoup/parser/TokeniserState;

    .line 885
    new-instance v0, Lorg/jsoup/parser/TokeniserState$41;

    const-string v1, "AfterAttributeValue_quoted"

    const/16 v15, 0x28

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$41;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AfterAttributeValue_quoted:Lorg/jsoup/parser/TokeniserState;

    .line 915
    new-instance v0, Lorg/jsoup/parser/TokeniserState$42;

    const-string v1, "SelfClosingStartTag"

    const/16 v15, 0x29

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$42;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->SelfClosingStartTag:Lorg/jsoup/parser/TokeniserState;

    .line 934
    new-instance v0, Lorg/jsoup/parser/TokeniserState$43;

    const-string v1, "BogusComment"

    const/16 v15, 0x2a

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$43;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BogusComment:Lorg/jsoup/parser/TokeniserState;

    .line 947
    new-instance v0, Lorg/jsoup/parser/TokeniserState$44;

    const-string v1, "MarkupDeclarationOpen"

    const/16 v15, 0x2b

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$44;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->MarkupDeclarationOpen:Lorg/jsoup/parser/TokeniserState;

    .line 965
    new-instance v0, Lorg/jsoup/parser/TokeniserState$45;

    const-string v1, "CommentStart"

    const/16 v15, 0x2c

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$45;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CommentStart:Lorg/jsoup/parser/TokeniserState;

    .line 993
    new-instance v0, Lorg/jsoup/parser/TokeniserState$46;

    const-string v1, "CommentStartDash"

    const/16 v15, 0x2d

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$46;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CommentStartDash:Lorg/jsoup/parser/TokeniserState;

    .line 1021
    new-instance v0, Lorg/jsoup/parser/TokeniserState$47;

    const-string v1, "Comment"

    const/16 v15, 0x2e

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$47;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->Comment:Lorg/jsoup/parser/TokeniserState;

    .line 1043
    new-instance v0, Lorg/jsoup/parser/TokeniserState$48;

    const-string v1, "CommentEndDash"

    const/16 v15, 0x2f

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$48;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CommentEndDash:Lorg/jsoup/parser/TokeniserState;

    .line 1066
    new-instance v0, Lorg/jsoup/parser/TokeniserState$49;

    const-string v1, "CommentEnd"

    const/16 v15, 0x30

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$49;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CommentEnd:Lorg/jsoup/parser/TokeniserState;

    .line 1099
    new-instance v0, Lorg/jsoup/parser/TokeniserState$50;

    const-string v1, "CommentEndBang"

    const/16 v15, 0x31

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$50;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CommentEndBang:Lorg/jsoup/parser/TokeniserState;

    .line 1127
    new-instance v0, Lorg/jsoup/parser/TokeniserState$51;

    const-string v1, "Doctype"

    const/16 v15, 0x32

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$51;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->Doctype:Lorg/jsoup/parser/TokeniserState;

    .line 1154
    new-instance v0, Lorg/jsoup/parser/TokeniserState$52;

    const-string v1, "BeforeDoctypeName"

    const/16 v15, 0x33

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$52;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BeforeDoctypeName:Lorg/jsoup/parser/TokeniserState;

    .line 1189
    new-instance v0, Lorg/jsoup/parser/TokeniserState$53;

    const-string v1, "DoctypeName"

    const/16 v15, 0x34

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$53;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->DoctypeName:Lorg/jsoup/parser/TokeniserState;

    .line 1224
    new-instance v0, Lorg/jsoup/parser/TokeniserState$54;

    const-string v1, "AfterDoctypeName"

    const/16 v15, 0x35

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$54;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AfterDoctypeName:Lorg/jsoup/parser/TokeniserState;

    .line 1250
    new-instance v0, Lorg/jsoup/parser/TokeniserState$55;

    const-string v1, "AfterDoctypePublicKeyword"

    const/16 v15, 0x36

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$55;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AfterDoctypePublicKeyword:Lorg/jsoup/parser/TokeniserState;

    .line 1290
    new-instance v0, Lorg/jsoup/parser/TokeniserState$56;

    const-string v1, "BeforeDoctypePublicIdentifier"

    const/16 v15, 0x37

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$56;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BeforeDoctypePublicIdentifier:Lorg/jsoup/parser/TokeniserState;

    .line 1327
    new-instance v0, Lorg/jsoup/parser/TokeniserState$57;

    const-string v1, "DoctypePublicIdentifier_doubleQuoted"

    const/16 v15, 0x38

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$57;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->DoctypePublicIdentifier_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

    .line 1355
    new-instance v0, Lorg/jsoup/parser/TokeniserState$58;

    const-string v1, "DoctypePublicIdentifier_singleQuoted"

    const/16 v15, 0x39

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$58;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->DoctypePublicIdentifier_singleQuoted:Lorg/jsoup/parser/TokeniserState;

    .line 1383
    new-instance v0, Lorg/jsoup/parser/TokeniserState$59;

    const-string v1, "AfterDoctypePublicIdentifier"

    const/16 v15, 0x3a

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$59;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AfterDoctypePublicIdentifier:Lorg/jsoup/parser/TokeniserState;

    .line 1421
    new-instance v0, Lorg/jsoup/parser/TokeniserState$60;

    const-string v1, "BetweenDoctypePublicAndSystemIdentifiers"

    const/16 v15, 0x3b

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$60;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BetweenDoctypePublicAndSystemIdentifiers:Lorg/jsoup/parser/TokeniserState;

    .line 1458
    new-instance v0, Lorg/jsoup/parser/TokeniserState$61;

    const-string v1, "AfterDoctypeSystemKeyword"

    const/16 v15, 0x3c

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$61;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AfterDoctypeSystemKeyword:Lorg/jsoup/parser/TokeniserState;

    .line 1498
    new-instance v0, Lorg/jsoup/parser/TokeniserState$62;

    const-string v1, "BeforeDoctypeSystemIdentifier"

    const/16 v15, 0x3d

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$62;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BeforeDoctypeSystemIdentifier:Lorg/jsoup/parser/TokeniserState;

    .line 1535
    new-instance v0, Lorg/jsoup/parser/TokeniserState$63;

    const-string v1, "DoctypeSystemIdentifier_doubleQuoted"

    const/16 v15, 0x3e

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$63;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->DoctypeSystemIdentifier_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

    .line 1563
    new-instance v0, Lorg/jsoup/parser/TokeniserState$64;

    const-string v1, "DoctypeSystemIdentifier_singleQuoted"

    const/16 v15, 0x3f

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$64;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->DoctypeSystemIdentifier_singleQuoted:Lorg/jsoup/parser/TokeniserState;

    .line 1591
    new-instance v0, Lorg/jsoup/parser/TokeniserState$65;

    const-string v1, "AfterDoctypeSystemIdentifier"

    const/16 v15, 0x40

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$65;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->AfterDoctypeSystemIdentifier:Lorg/jsoup/parser/TokeniserState;

    .line 1618
    new-instance v0, Lorg/jsoup/parser/TokeniserState$66;

    const-string v1, "BogusDoctype"

    const/16 v15, 0x41

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$66;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->BogusDoctype:Lorg/jsoup/parser/TokeniserState;

    .line 1636
    new-instance v0, Lorg/jsoup/parser/TokeniserState$67;

    const-string v1, "CdataSection"

    const/16 v15, 0x42

    invoke-direct {v0, v1, v15}, Lorg/jsoup/parser/TokeniserState$67;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->CdataSection:Lorg/jsoup/parser/TokeniserState;

    const/16 v0, 0x43

    .line 6
    new-array v0, v0, [Lorg/jsoup/parser/TokeniserState;

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->Data:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CharacterReferenceInData:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v3

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->Rcdata:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v4

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CharacterReferenceInRcdata:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v5

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->Rawtext:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v6

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptData:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v7

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->PLAINTEXT:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v8

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->TagOpen:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v9

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->EndTagOpen:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v10

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->TagName:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v11

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->RcdataLessthanSign:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v12

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->RCDATAEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v13

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->RCDATAEndTagName:Lorg/jsoup/parser/TokeniserState;

    aput-object v1, v0, v14

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->RawtextLessthanSign:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->RawtextEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->RawtextEndTagName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataLessthanSign:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEndTagName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapeStart:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapeStartDash:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscaped:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedDash:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedDashDash:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedLessthanSign:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedEndTagOpen:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataEscapedEndTagName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapeStart:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscaped:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapedDash:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapedDashDash:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapedLessthanSign:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->ScriptDataDoubleEscapeEnd:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BeforeAttributeName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AttributeName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AfterAttributeName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BeforeAttributeValue:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AttributeValue_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AttributeValue_singleQuoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AttributeValue_unquoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AfterAttributeValue_quoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->SelfClosingStartTag:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BogusComment:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->MarkupDeclarationOpen:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CommentStart:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CommentStartDash:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->Comment:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CommentEndDash:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CommentEnd:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CommentEndBang:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x31

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->Doctype:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x32

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BeforeDoctypeName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x33

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->DoctypeName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x34

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AfterDoctypeName:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x35

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AfterDoctypePublicKeyword:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x36

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BeforeDoctypePublicIdentifier:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x37

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->DoctypePublicIdentifier_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x38

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->DoctypePublicIdentifier_singleQuoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x39

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AfterDoctypePublicIdentifier:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BetweenDoctypePublicAndSystemIdentifiers:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AfterDoctypeSystemKeyword:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BeforeDoctypeSystemIdentifier:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->DoctypeSystemIdentifier_doubleQuoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->DoctypeSystemIdentifier_singleQuoted:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->AfterDoctypeSystemIdentifier:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x40

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->BogusDoctype:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x41

    aput-object v1, v0, v2

    sget-object v1, Lorg/jsoup/parser/TokeniserState;->CdataSection:Lorg/jsoup/parser/TokeniserState;

    const/16 v2, 0x42

    aput-object v1, v0, v2

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->$VALUES:[Lorg/jsoup/parser/TokeniserState;

    const v0, 0xfffd

    .line 1650
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/jsoup/parser/TokeniserState;->replacementStr:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILorg/jsoup/parser/TokeniserState$1;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lorg/jsoup/parser/TokeniserState;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lorg/jsoup/parser/TokeniserState;->replacementStr:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lorg/jsoup/parser/Tokeniser;Lorg/jsoup/parser/CharacterReader;Lorg/jsoup/parser/TokeniserState;)V
    .locals 0

    .line 6
    invoke-static {p0, p1, p2}, Lorg/jsoup/parser/TokeniserState;->handleDataEndTag(Lorg/jsoup/parser/Tokeniser;Lorg/jsoup/parser/CharacterReader;Lorg/jsoup/parser/TokeniserState;)V

    return-void
.end method

.method static synthetic access$300(Lorg/jsoup/parser/Tokeniser;Lorg/jsoup/parser/CharacterReader;Lorg/jsoup/parser/TokeniserState;Lorg/jsoup/parser/TokeniserState;)V
    .locals 0

    .line 6
    invoke-static {p0, p1, p2, p3}, Lorg/jsoup/parser/TokeniserState;->handleDataDoubleEscapeTag(Lorg/jsoup/parser/Tokeniser;Lorg/jsoup/parser/CharacterReader;Lorg/jsoup/parser/TokeniserState;Lorg/jsoup/parser/TokeniserState;)V

    return-void
.end method

.method private static final handleDataDoubleEscapeTag(Lorg/jsoup/parser/Tokeniser;Lorg/jsoup/parser/CharacterReader;Lorg/jsoup/parser/TokeniserState;Lorg/jsoup/parser/TokeniserState;)V
    .locals 2

    .line 1698
    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->matchesLetter()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1699
    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->consumeLetterSequence()Ljava/lang/String;

    move-result-object p1

    .line 1700
    iget-object p2, p0, Lorg/jsoup/parser/Tokeniser;->dataBuffer:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1701
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/Tokeniser;->emit(Ljava/lang/String;)V

    return-void

    .line 1705
    :cond_0
    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->consume()C

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 1721
    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->unconsume()V

    .line 1722
    invoke-virtual {p0, p3}, Lorg/jsoup/parser/Tokeniser;->transition(Lorg/jsoup/parser/TokeniserState;)V

    goto :goto_1

    .line 1714
    :sswitch_0
    iget-object p1, p0, Lorg/jsoup/parser/Tokeniser;->dataBuffer:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "script"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1715
    invoke-virtual {p0, p2}, Lorg/jsoup/parser/Tokeniser;->transition(Lorg/jsoup/parser/TokeniserState;)V

    goto :goto_0

    .line 1717
    :cond_1
    invoke-virtual {p0, p3}, Lorg/jsoup/parser/Tokeniser;->transition(Lorg/jsoup/parser/TokeniserState;)V

    .line 1718
    :goto_0
    invoke-virtual {p0, v0}, Lorg/jsoup/parser/Tokeniser;->emit(C)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xc -> :sswitch_0
        0xd -> :sswitch_0
        0x20 -> :sswitch_0
        0x2f -> :sswitch_0
        0x3e -> :sswitch_0
    .end sparse-switch
.end method

.method private static final handleDataEndTag(Lorg/jsoup/parser/Tokeniser;Lorg/jsoup/parser/CharacterReader;Lorg/jsoup/parser/TokeniserState;)V
    .locals 3

    .line 1658
    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->matchesLetter()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1659
    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->consumeLetterSequence()Ljava/lang/String;

    move-result-object p1

    .line 1660
    iget-object p2, p0, Lorg/jsoup/parser/Tokeniser;->tagPending:Lorg/jsoup/parser/Token$Tag;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/jsoup/parser/Token$Tag;->appendTagName(Ljava/lang/String;)V

    .line 1661
    iget-object p0, p0, Lorg/jsoup/parser/Tokeniser;->dataBuffer:Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1666
    invoke-virtual {p0}, Lorg/jsoup/parser/Tokeniser;->isAppropriateEndTagToken()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1667
    invoke-virtual {p1}, Lorg/jsoup/parser/CharacterReader;->consume()C

    move-result p1

    sparse-switch p1, :sswitch_data_0

    .line 1684
    iget-object v0, p0, Lorg/jsoup/parser/Tokeniser;->dataBuffer:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1680
    :sswitch_0
    invoke-virtual {p0}, Lorg/jsoup/parser/Tokeniser;->emitTagPending()V

    .line 1681
    sget-object p1, Lorg/jsoup/parser/TokeniserState;->Data:Lorg/jsoup/parser/TokeniserState;

    invoke-virtual {p0, p1}, Lorg/jsoup/parser/Tokeniser;->transition(Lorg/jsoup/parser/TokeniserState;)V

    goto :goto_0

    .line 1677
    :sswitch_1
    sget-object p1, Lorg/jsoup/parser/TokeniserState;->SelfClosingStartTag:Lorg/jsoup/parser/TokeniserState;

    invoke-virtual {p0, p1}, Lorg/jsoup/parser/Tokeniser;->transition(Lorg/jsoup/parser/TokeniserState;)V

    goto :goto_0

    .line 1674
    :sswitch_2
    sget-object p1, Lorg/jsoup/parser/TokeniserState;->BeforeAttributeName:Lorg/jsoup/parser/TokeniserState;

    invoke-virtual {p0, p1}, Lorg/jsoup/parser/Tokeniser;->transition(Lorg/jsoup/parser/TokeniserState;)V

    :goto_0
    move v2, v0

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 1692
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "</"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/jsoup/parser/Tokeniser;->dataBuffer:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/jsoup/parser/Tokeniser;->emit(Ljava/lang/String;)V

    .line 1693
    invoke-virtual {p0, p2}, Lorg/jsoup/parser/Tokeniser;->transition(Lorg/jsoup/parser/TokeniserState;)V

    :cond_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_2
        0xa -> :sswitch_2
        0xc -> :sswitch_2
        0xd -> :sswitch_2
        0x20 -> :sswitch_2
        0x2f -> :sswitch_1
        0x3e -> :sswitch_0
    .end sparse-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jsoup/parser/TokeniserState;
    .locals 1

    .line 6
    const-class v0, Lorg/jsoup/parser/TokeniserState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jsoup/parser/TokeniserState;

    return-object p0
.end method

.method public static values()[Lorg/jsoup/parser/TokeniserState;
    .locals 1

    .line 6
    sget-object v0, Lorg/jsoup/parser/TokeniserState;->$VALUES:[Lorg/jsoup/parser/TokeniserState;

    invoke-virtual {v0}, [Lorg/jsoup/parser/TokeniserState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jsoup/parser/TokeniserState;

    return-object v0
.end method


# virtual methods
.method abstract read(Lorg/jsoup/parser/Tokeniser;Lorg/jsoup/parser/CharacterReader;)V
.end method
